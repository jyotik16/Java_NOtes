package com;

import java.util.ArrayList;
import java.util.Scanner;
public class firstNegIntegerInWindow {

	static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 int t=sc.nextInt();boolean flag=false;
			 while(t-- > 0){
			     ArrayList<Integer> list=new ArrayList<>();
			     int n=sc.nextInt();
			     int a[]=new int[n];
			     
			     for(int i=0;i<n;i++) 
			    	 a[i]=sc.nextInt();
			     
			     int window=sc.nextInt();
			     
			     for(int i=0;i<=n-window;i++){
			         flag=false;
			         for(int j=i;j<i+window;j++){
			             if(a[j]<0){
			                 list.add(a[j]);
			                 flag=true;
			                 break;
			             }
			         }
			         //if(!flag) list.add(0);
			       
			     }
			     for(Integer x:list)
			        System.out.print(x+" ");
			        list.clear();
			        System.out.println();
			 }
			 }
}
		
