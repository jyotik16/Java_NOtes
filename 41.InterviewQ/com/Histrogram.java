package com;

import java.util.Scanner;

public class Histrogram {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//int[] arr= {1,3,2,4,5};
		int n=5;
		//int n=scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		greaterarea(arr,n);
		
	}
public static  void greaterarea(int[] arr,int n) {
	int maxarea=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<=n;j++) {
			int ht=findminbar(i,j,arr);
			int lt=Math.abs(j-i);
			 
			if(maxarea<(lt*ht))
				maxarea=lt*ht;
		}
	}
	System.out.println(maxarea);
}
public static int findminbar(int i,int j,int[] ar) {
	int min=Integer.MAX_VALUE;
	for(int k=i;k<j;k++) {
		if(min>ar[k])
			min=ar[k];
	}
	return min;
	
}
}
