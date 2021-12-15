package com;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String a[]){
        
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        System.out.println(ts);
    }
}
 
class MyComp implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1); //descending
    }
}
