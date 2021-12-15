package com;

import java.util.Scanner;
import java.util.Arrays;
public class Asc_Des_arrayy {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 6;
		int []ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = scn.nextInt();
		}
		
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		int j=1;
		for(int i=0;i<ar.length;i++) {
			
			if(i<ar.length/2)
				System.out.println(ar[i]);
			else {
				System.out.println(ar[ar.length-j]);
				j++;
			}
		}
	}
}
