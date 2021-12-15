package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		int ar[] = {1,4,3,5,6,2};
		List<Integer> ll = new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++) {
			ll.add(ar[i]);
		}
//		List<Integer> li = new ArrayList<Integer>();
//		li.add(4);
//		li.add(1);
//       li.add(3);
//       li.add(2);
//          System.out.println("List: "+li);
//          			List: [4, 1, 3, 2]
//        		  TreeSet: [1, 2, 3, 4]
        TreeSet<Integer> myset = new TreeSet<Integer>(ll);
        //myset.addAll(li);
        System.out.println("TreeSet: "+myset);
        //TreeSet: [1, 2, 3, 4, 5, 6]
        //coverting back treeSet into int ar[]
		ar = new int[ar.length];
		int i=0;
        Iterator<Integer> itr = myset.iterator();
        while(itr.hasNext()){        	
        	ar[i++] = itr.next();
        	}
        System.out.println("Sorted array: ");
        for(i=0;i<ar.length;i++) {
        	  System.out.print(ar[i]);
		}
        
	}
}
