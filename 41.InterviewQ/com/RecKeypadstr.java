package com;

import java.util.ArrayList;
import java.util.Scanner;

public class RecKeypadstr {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		CountKeypadstring(str, "");
		printKeypadstring(str,"");
		
		
	}


	public static ArrayList<String> Keypadstring(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = Keypadstring(ros);
		ArrayList<String> mr = new ArrayList<>();
		String Code = getCode(ch);
		for (int j = 0; j < Code.length(); j++) {
			for (String rrs : rr) {
				mr.add(Code.charAt(j) + rrs);
			}
		}
		return mr;
	}

	public static int CountKeypadstring(String str,String ans) {
		if (str.length() == 0) {
			
			return 1;
		}
		int count=0;
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String Code = getCode(ch);
		for (int j = 0; j < Code.length(); j++) {
			
			count+=CountKeypadstring(ros,ans+Code.charAt(j));
		}
		return count;
	}
	public static void printKeypadstring(String str,String ans) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String Code = getCode(ch);
		for (int j = 0; j < Code.length(); j++) {
			
			printKeypadstring(ros,ans+Code.charAt(j));
			
			
		}
		
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		if (ch == '2')
			return "def";
		if (ch == '3')
			return "ghi";
		if (ch == '4')
			return "jklm";
		if (ch == '5')
			return "nop";
		if (ch == '6')
			return "qr";
		if (ch == '7')
			return "stu";
		if (ch == '8')
			return "vw";
		if (ch == '9')
			return "xyz";
		else if (ch == '0')
			return "#$";
		else
			return "";
	}

	
}
