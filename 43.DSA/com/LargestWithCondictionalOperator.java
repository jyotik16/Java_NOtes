
package com;

public class LargestWithCondictionalOperator {

	public static void main(String[] args) {
		int a =4,b=5,c=7;
		int res = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(res);
		
	}
}
