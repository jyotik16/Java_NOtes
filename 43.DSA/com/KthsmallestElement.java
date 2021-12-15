package com;

import java.util.Arrays;
import java.util.Scanner;

public class KthsmallestElement {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	int ar[] = {2,6,5,9,8}; //2 5 6 8 9
	small(ar);
	
}

private static void small(int[] ar) {
	int k = sc.nextInt();
	Arrays.sort(ar); //logn
	//print(ar);
	if(k==0)
		System.out.println(ar[0]);
	else if(k==ar.length)
		System.out.println(ar[k]);
	else {
		System.out.println(ar[k-1]);
	}
		
}
private static void print(int ar[]) {
	
	for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
}
}
