package com;

public class SplitNumIntoDigits {

	public static void main(String[] args) {
		int num = 2451;
		int rem=0,c=0;
		
		while(num>0) {
			rem = num%10;
			int mul = (int) Math.pow(10, c);
			rem = rem*mul;
			System.out.println(rem);
			rem=0;
			c++;
			num=num/10;
		}
	}
}
