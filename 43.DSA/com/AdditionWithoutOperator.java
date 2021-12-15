package com;

import java.util.Scanner;

public class AdditionWithoutOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==0)
			System.out.println(b);
		else if(b==0)
			System.out.println(a);
		else 
		{
			int sum=0;
			while(b!=0) {
			int c = a&b;			
			 a = a^b; //XOR
				b = c<<1;
				System.out.println("c="+c+"a="+a+"b="+b);
			}
			
			System.out.println(a);
		}
		
	}
}

