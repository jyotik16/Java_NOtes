### Sort the HashMap By Value and By Key

> HashMap<String, Integer> hm = **new** HashMap<String, Integer>();
>
> ​        hm.put("Math", 98);        hm.put("Data Structure", 85);
>
> ​        hm.put("Database", 91);        hm.put("Java", 95);
>
> ​        hm.put("Operating System", 79);        hm.put("Networking", 80);       
>
> ​        List <Entry<String, Integer>> capitalList = **new** LinkedList<>(hm.entrySet()); 
>
> ​        System.**out**.println();
>
> ​        **for**(Entry<String, Integer> en:capitalList) {
>
> ​        System.**out**.println(en.getKey()+"->"+en.getValue());
>
> ​        }
>
> ​        Collections.*sort*(capitalList,(l1,l2) -> l1.getValue().compareTo(l2.getValue())); //By Value
>
> ​        Collections.*sort*(capitalList,(l1,l2) -> l1.getKey().compareTo(l2.getKey())); //By Value



package com.RealTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		dummyData(employeeList);
		System.out.println(employeeList);
		
	//  ConcurrentMap<Integer, String> m= new ConcurrentHashMap<>();
		
		List<Integer> list = List.of(1,2,4,5);
	
		Optional<Integer> ele = list.stream().findFirst();
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
	    // Adding the elements using put method
				
	    hmap.put(10, "Geeks");        hmap.put(20, "for");
	    hmap.put(30, "Geeks");        hmap.put(25, "Welcome");
	    hmap.put(40, "you"); 
	    // Creating a synchronized map
	    Map map = Collections.synchronizedMap(hmap);
		
		//How many male or female candidates are there in the organization?
		getMaleOrFemale(employeeList);
		// Print the name of all departments in the organization?
		getNamesORG(employeeList);
		// What is the average age of male and female employee?
		getAvgAge(employeeList);
		//Get the details of highest paid employee in the organization?
		getHighPayEmp(employeeList);
		// Get the names of all employees who have joined after 2015?
		getNameOfEmpJA15(employeeList);
		//Count the number of employees in each department?
		getEmpByDeptment(employeeList);
		//What is the average salary of each department?
		getAvgSalDept(employeeList);
		// Get the details of youngest male employee in the product development department?
		fun1(employeeList);
		//Who has the most working experience in the organization?
		fun2(employeeList);
		//List down the names of all employees in each department?
		fun3(employeeList);
		//Print the length of the names in Employee
		fun4(employeeList);
		//CodePonits Example
		fun5();
		//find the Avg,Sum,Total Of Employee Salary
		fun6(employeeList);
		//update the salary by 5K if sal of emp is less than 10K
		updateSalaryBy5K(employeeList);
	}
	
	private static void printData(List<Employee> employeeList) {
        employeeList.stream().forEach(System.out::println);
    }

    private static void updateSalaryBy5K(List<Employee> employeeList) {
        long sal = 10L;
       List<Employee> filetredList = employeeList.stream().filter(emp->emp.getSalary()>sal).collect(Collectors.toList());

       long incsal = 5L;
        List<Employee> filetredList2 = employeeList.stream().filter(emp->emp.getSalary()<sal)
                        .map(emp->{
                            emp.setSalary(emp.getSalary()+incsal);
                            return emp;
                        }
                        ).collect(Collectors.toList());
        printData(filetredList2);
    }
	
	private static void fun6(List<Employee> employeeList) {
		System.out.println();
		System.out.println("EmployeeTest.fun6()");
		 DoubleSummaryStatistics avgT = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		 System.out.println("Avergage::"+avgT.getAverage()+" Total "+avgT.getSum());
		 System.out.println("Maximum Salary:"+avgT.getMax()+" Minimum Salary:"+avgT.getMin());
		 //OR Normal List sum avg
		 List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6);
				
		Integer summ  = list11.stream().collect(Collectors.summingInt(Integer::intValue));
		Double avg = list11.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("----Sum---&&---Avg-----");
		System.out.println(summ+" "+avg);	
	}
	
	private static void fun5() {
		System.out.println();
		System.out.println("EmployeeTest.fun5()");
		
		String str="Jyoti Kashyap 123456&6^";
		IntStream streams = str.codePoints();	
		//streams.filter(ch->ch >= 97).filter(ch->ch<=97+32).forEach(System.out::println);
		Map<Character,Integer> map = 
				streams.filter(ch->ch >= 97).filter(ch->ch<=97+32).
				map(ch->Character.valueOf((char)ch)).	collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	}
	
	private static void fun4(List<Employee> employeeList) {
		System.out.println();	
		System.out.println("print the length of name");
		employeeList.stream().map(Employee::getName).map(String::length).forEach(System.out::println);
		System.out.println();
		System.out.println("EmployeeTest.fun4() ");
		List<String> name = Arrays.asList("Jyoti","Ankita","Janvi");
		name.stream().map(String::length).forEach(System.out::println);
	}
	
	private static void fun3(List<Employee> employeeList) {
		Map<String, List<Employee>> employeeListByDepartment=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
				         
		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();
		employeeListByDepartment.forEach((K,V)->System.out.println(K+" "+V));
				         
	}
	
	private static void fun2(List<Employee> employeeList) {
		System.out.println();
		Optional<Employee> seniorMostEmployeeWrapper=
				employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
	// employeeList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				         
		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
	}
	
	private static void fun1(List<Employee> employeeList) {
		System.out.println();
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
			employeeList.stream()
				 .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
		          .min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestMaleEmployeeInProductDevelopmentWrapper);
		
		Optional<Employee> EmpWithMaxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		
	}
	
	private static void getAvgSalDept(List<Employee> employeeList) {
		System.out.println();
		Map<String, Double> map = employeeList.stream()
									.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	
	}
	
	private static void getEmpByDeptment(List<Employee> employeeList) {
		System.out.println();
		Map<String, Long> map = employeeList.stream()
									.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(map);
	}
	
	private static void getNameOfEmpJA15(List<Employee> employeeList) {
		System.err.println();
		System.out.println("******EmployeeTest.getNameOfEmpJA15()******");
		employeeList.stream()
	    	.filter(e -> e.getYearOfJoining() > 2015)
	    	.map(Employee::getName)
	    	.forEach(System.out::println);		
	}
	
	private static void getHighPayEmp(List<Employee> employeeList) {
		System.err.println();
		System.out.println("*********EmployeeTest.getHighPayEmp()***********1");
		Comparator<Employee> comp = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge);
		Collections.sort(employeeList,comp);		
	//	employeeList.sort(Comparator.comparing(e->e.getSalary()));
		System.out.println(employeeList.get(employeeList.size()-1));
		/*List<Employee> sortedList = employeeList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);*/ //U need  to override the compareto () in Entity class
		
		System.out.println("*********EmployeeTest.getHighPayEmp()***********2");
		Optional<Employee> highestPaidEmployeeWrapper=
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
				         
		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get(); //OR
		
		Optional<Employee> EmpWithMaxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		
	}
	
	private static void getAvgAge(List<Employee> employeeList) {
		System.out.println("******EmployeeTest.getAvgAge()********");
		
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
		employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		long sum = employeeList.stream().map(e->e.getGender().equals("Male")).count(); 
		
		System.out.println(avgAgeOfMaleAndFemaleEmployees);


	}

	private static void getNamesORG(List<Employee> employeeList) {
		/*List<String> dept = employeeList.stream().map(e->e.getDepartment())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(dept);*/
		System.out.println("***********************");
		employeeList.stream()
	    			.map(Employee::getDepartment)
	    			.distinct()
	    			.forEach(System.out::println);
		
	}
	
	private static void getMaleOrFemale(List<Employee> employeeList) {
		long maleCount = employeeList.stream().filter(e->e.getGender().equals("Male")).count();
		long femaleCount = employeeList.stream().filter(e->e.getGender().equals("Female")).count();
		System.out.println("***********************");
		System.out.println("male candicates are: "+maleCount);
		System.out.println("female candicates are: "+femaleCount);
		
		//****************OR*************
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				         
		System.out.println(noOfMaleAndFemaleEmployees);
	}
	
	private static void dummyData(List<Employee> employeeList) {


		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 250000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 135000.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 180000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 325000.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 105000.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 270000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 345000.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 115000.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 110000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 157000.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 282000.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 213000.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 107000.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 127000.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 289000.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 357000.0));
		
	}


}
