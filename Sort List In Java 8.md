## Sort List In Java 8

**Java Parallel Streams** is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor. Normally any java code has one stream of processing, where it is executed sequentially. Whereas by using parallel streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes. The order of execution, however, is not under our control.

 Therefore, it is advisable to use parallel streams in cases where no matter what is the order of execution, the result is unaffected and the state of one element does not affect the other as well as the source of the data also remains unaffected.

```java

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sort_Lsit_In_Java8 {
	static class Employee implements Comparable<Employee>{
		int id; String name; String city;

		public Employee(int id, String name, String city) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public int compareTo(Employee o) {

			if (this.id > o.id) {
				return 1;
			} else if (this.id < o.id) {
				return -1;
			} else {
				return 0;
			}	 	
			
		//	return this.name.compareTo(o.name);
		}	
	}
	public static List<Employee> employeeList = new ArrayList<>();
	
	public static void createEmployeeList() {
		Employee e1 = new Employee(1,"Aman","Delhi");
		Employee e2 = new Employee(2,"Abhi","Banglore");
		Employee e3 = new Employee(3,"Ravi","Pune");
		Employee e4 = new Employee(4,"Azhar","Pune");
		
		employeeList.add(e3);
		employeeList.add(e2);
		employeeList.add(e1);
		employeeList.add(e4);
	}
	
	public static void covertListToMap() {
		Map<String, List<Employee>> empMap = employeeList
				.stream()
				.collect(Collectors.groupingBy(Employee::getCity));
		
		/*
		 * Set<Entry<String,List<Employee>>> keySet = empMap.entrySet();
		 * 
		 * for(Entry<String,List<Employee>> e:keySet) {
		 * System.out.println(e.getKey()+" "+e.getValue()); }
		 */
		empMap.forEach((K,V)->System.out.println(K+" "+V));
	}
			
	public static void sortEmployeeListByComparator() {
		
		//classic way 
	/*	Collections.sort(employeeList,new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {					
					return ((Employee) o1).getName().compareTo(((Employee) o2).getName());
				}			 
			  });
	*/		 
		Collections.sort(employeeList,(Employee e1,Employee e2)->e1.getName().compareTo(e2.getName()));
		Collections.reverse(employeeList); // OR		
	//	Collections.sort(employeeList,(Employee e1,Employee e2)->e2.getName().compareTo(e1.getName())); //reverse
	//	employeeList.sort(Comparator.comparing(Employee::getCity));
	//	employeeList.sort(Comparator.comparing(e->e.getCity())); //using lamda
	//	employeeList.sort(Comparator.comparing(Employee::getCity).thenComparing(Employee::getName));
		
	//	Comparator<Employee> gpbyComparator = Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);
	//	Collections.sort(employeeList, gpbyComparator);
		
		System.out.println(employeeList);
	}
	
	static void sortEmployeeListByStream() {
		List<Employee> sortedList = employeeList.stream().sorted().collect(Collectors.toList());
	//	List<Employee> reverseSortedList = employeeList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmployeeList();
		System.out.println(employeeList);
		System.out.println();
	//	covertListToMap();
	//	sortEmployeeListByComparator();
		sortEmployeeListByStream();
	}

}

private static void removeCharactesInString() {
        String string = "cbacdcbc";

      System.out.println("***** print  non duplicate characters *****");
      Set<Character> l = string.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toSet());
        l.stream().forEach(System.out::println); //print only duplicate element
        // difference in retrun type
        Set<Character> set = new HashSet<>();
        List<Character> res = string.chars()
                .mapToObj(item->(char)item).
                filter(e->set.add(e)).collect(Collectors.toList());
        res.stream().forEach(System.out::println);
    }

    private static void removeDuplicateInStrings() {
        String orignalString = "world world";

        String output = Arrays.asList(orignalString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println("Original String : " + orignalString);
        System.out.println("After removing the duplicates : " + output);

    }
    
    private static void FindSecondLargestNumberInAnArraysUsingJava8Stream() {
        // random numbers Array
        int[] numbers = {5, 9, 11, 2, 8, 21, 1,21}; //[1,2,5,8,9,11,21,21]

        // print to console
        System.out.println("Numbers in an Arrays : "+ Arrays.toString(numbers));
        int n = 2;
        // sort in descending-order and get 2nd largest element
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(n-1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber);
       // Stream<Integer> res= Arrays.stream(numbers).boxed(); Array ko stream<Integer> convert by boxed()
       // System.out.println(res);

        //By using limit()
        List<Integer> numbersList = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        int secondLargestNumber2 = numbersList
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(n)
                .skip(n-1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber2);

    }
    
    
Sorting Examples in Java 8
1. Sort Array of Strings ignoring the case and print them to System out
public void sortStrings() {
 String[] names = {"One", "Two", "Three", "Four", "Five", "Six"};
 Stream.of(names).sorted(String::compareToIgnoreCase).forEach(System.out::println);
}
 2. Sort String based on their length
private void sortStringsBasedOnLength() {
 String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
 Stream.of(names)
 .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
 .forEach(System.out::println);
}
 3.Parallel Sort employees by hire date and print them to console
private void sortEmployees(List<Employee> employees){
 employees.parallelStream()
 .sorted((o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()))
 .forEach(employee -> System.out.println("employee = " + employee));
}
4. Shortcut method for last example -
private void sortEmployees2(List<Employee> employees) {
 employees.parallelStream()
 .sorted(Comparator.comparing(Employee::getHireDate))
 .forEach(employee -> System.out.println("employee = " + employee));
}
5. Multiple Sort Criteria - Sort employees by first name and then by last name and print output to console
public void multiple_sort(List<Employee> employees) {
 Comparator<Employee> byFirstName = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
 Comparator<Employee> byLastName = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
 employees.stream()
 .sorted(byFirstName.thenComparing(byLastName))
 .forEach(e -> System.out.println(e));
 
 
}
```
>

