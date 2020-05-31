package com;

import java.util.Scanner;

public class LeftRotation {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	int ar[] = {1,2,3,4,5};
	//leftrotate(ar,2);
	//print(ar);
	fun(ar);
	/*
	 * 1 ->2 3 4 5 1 
	 * 2-> 3 4 5 1 2
	 */
}
private static void fun(int[] ar) {
		StringBuilder res=new StringBuilder();
	 
	     int n=sc.nextInt();
	     int d=sc.nextInt();
	     int r[]=new int[n];
	     int m[]=new int[n];
	     for(int j=0;j<n;j++)
	     {
	         r[j]=sc.nextInt();
	         if(j>=d)
	        	 m[j-d]=r[j];
	         else{
	             m[n-d+j]=r[j];
	         }
	     }
	      for(int j=0;j<n;j++)
	      {
	          res.append(m[j]+" ");
	      }
	         res.append('\n');
	 System.out.println(res);
	
}
private static void leftrotate(int[] ar,int d) {
	
	int size = ar.length;
	int gcd=find_gcd(d,size);
	
	for(int i=0;i<gcd;i++) {
		int tem = ar[i];
		int j=i;
		while(true) {
			int k = j + d;
			if(k>=size)
				k = k-size;
			
			if(k==i)
				break;
			
			ar[j] = ar[k];
			j=k;
		}
		ar[j] = tem;
	}
	
}
private static int find_gcd(int r, int size) {
	
	if(size==0)
		return r;
	else
		return find_gcd(r,r%size);
	
}	
private static void print(int ar[]) {
	
	for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
}
}
