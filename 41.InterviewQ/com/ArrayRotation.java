package com;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayRotation {

public static void main(String[] args) {
	
	char ar[] = args[0].toCharArray();
	ArrayList<Integer> l = new ArrayList<>();
	
	for(char cc:ar) {
		int item = (int)cc-48;
		l.add(item);
	}
		
	
	Collections.rotate(l, 2);  //[4, 5, 1, 2, 3] RightRotate
	Collections.rotate(l, -2); //[3, 4, 5, 1, 2] Left Rotate
	System.out.println(l);
	
}	
}
