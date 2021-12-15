package com;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(args[0]);
		int []ar = new int[size];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<ar.length-1;i++) {
			int key = i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[key]) {
					key = j;
				}
				
				int temp = ar[key];
				ar[key] = ar[i];
				ar[i] = temp ;
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(" "+ar[i]);
		}
		
	}
}
