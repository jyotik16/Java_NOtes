package com;

import java.util.TreeSet;

public class RemoveDupliUsingTreeSet {
	 public static void main(String a[]){
	        String[] strArr = {"one","two","three","one","four","four","five"};
	        TreeSet<String> unique = new TreeSet<String>();
	        for(String str:strArr){
	            if(!unique.add(str)){
	                System.out.println("Duplicate Entry is: "+str);
	            }
	        }
	    }
}
