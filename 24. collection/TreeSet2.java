package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

public class TreeSet {
	
	public static void main(String args[]){  
		  
		List<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay"));  
		al.add(new Student(106,"Ajay"));  
		al.add(new Student(105,"Jai"));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator() {
			public int compare(Student s1,Student s2){  
				return s2.name.compareTo(s1.name);  
				} 
		});  
		for(Student st: al){  
		System.out.println(st.age+" "+st.name+" ");  
		}  
}
}	
	 class Student {
		int age;
		String name;
		
		public Student(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }
		
	}
	class NameComparator implements Comparator<Student>{  
		public int compare(Student s1,Student s2){  
		return s1.name.compareTo(s2.name);  
		}
	}

	
	class AgeComparator implements Comparator<Student>{  
		public int compare(Student s1,Student s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  
		}  
