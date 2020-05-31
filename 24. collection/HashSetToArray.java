package com;

import java.util.HashSet;

public class HashSetToArray {
public static void main(String []args) {
	HashSet<Integer> set = new HashSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(5);
	System.out.println("hashset :"+set);
	Object[] array = set.toArray();
		
	for(Object str:array) {
		System.out.println(str);
	}
	
		/*
		 * String[] array2 = new String[set.size()]; set.toArray(array2); 
			for(String str:array2) { System.out.println(str); } //wrong
		 */
}
}
