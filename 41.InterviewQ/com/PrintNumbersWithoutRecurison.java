package com;

public class PrintNumbersWithoutRecurison {

	public static void main(String[] args) {
		
		int n=1;
		fun(n);
	}

	private static void fun(int n) {
		
		if(n==101)
			return;
		System.out.print(n+" ");
		fun(n+1);
		
	}
}
