## Sort List In Java 8
```package com.java8;

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
	
	>public static void covertListToMap() {
		Map<String, List<Employee>> empMap = employeeList
				.stream()
				.collect(Collectors.groupingBy(Employee::getCity));
		
		/*
		 * Set<Entry<String,List<Employee>>> keySet = empMap.entrySet();
		 * 
		 * for(Entry<String,List<Employee>> e:keySet) {
		 * System.out.println(e.getKey()+" "+e.getValue()); }
		 */
		**empMap.forEach((K,V)->System.out.println(K+" "+V));**
	}
			
	>public static void sortEmployeeListByComparator() {
		
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
	
	>static void sortEmployeeListByStream() {
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
```
>

