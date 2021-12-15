package com;

import java.util.Scanner;

public class RecDuplicateCharacters {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 String str = scn.nextLine();
		 removeduplicate1(str);
		 
	}

	public static void removeduplicate(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length()-1;i++) {
			sb.append(str.charAt(i));
			if(str.charAt(i)==str.charAt(i+1))
			{
				sb.append("*");
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb.toString());
	}
	public static void removeduplicate1(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i)==str.charAt(i+1))
			{
				continue;
			}
			else {
				sb.append(str.charAt(i));
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb.toString());
	}
}
