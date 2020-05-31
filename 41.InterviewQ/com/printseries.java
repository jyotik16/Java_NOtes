package com;

import java.util.Scanner;

public class printseries {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n1=scn.nextInt();
//		int n2=scn.nextInt();
//		int i=1; int j=1; int count=0;
//		while(i<=n1)
//		{
//			int k=3*j+2;
//			if(k%n2!=0)
//			System.out.print(k+" ");
//			else
//			{ n1++;	}
//			i++; j++;
//				
//		}
		int r=scn.nextInt();
		int number=1;
		for(int i=0;i<r;i++)
			{
				number = 1;
				for(int j=0;j<=i;j++)
				{
					 System.out.print(number+ " ");
	                 number = number * (i - j) / (j + 1);
				}
				System.out.println();
			}
			 
	}
	

}
