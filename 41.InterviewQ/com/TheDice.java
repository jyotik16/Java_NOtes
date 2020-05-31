package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheDice {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	
	//int num = Integer.parseInt(in.readLine().trim());
	int c=1;
	String s = in.readLine();
	if(s.equals("6")|| s.substring(s.length()-1).equals("6")) {
		System.out.println("-1");
	}
	else {
		for(int k=0;k<s.length()-1;k++) {
			if(s.charAt(k)!='6')
				c++;		
		}
		System.out.println(c);
	}
	
}

}
/*
 * 6612
 * 2
 * 336652
 * 4
 * */
