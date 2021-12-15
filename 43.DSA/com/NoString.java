package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class NoString {
public static void main(String[] args) throws Exception {
	
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	String s = in.readLine();
	
f1(s); f2(s);
	
}
static void f2(String s) {
	HashMap<Character,Integer> m = new HashMap<>();
	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(!m.containsKey(c)) {
			m.put(c, 1);
		}		
	}
	int count = m.size();
	System.out.println(count);
}
static void f1(String s) {
	int count=0; int max=0;
	char[] c = s.toCharArray();
	for(int i=0;i<c.length-1;i++) {
		if(c[i]==c[i+1]) {
			count=0;
		}else {
			count++;
		}
		if(count>max) {
			max=count;
		}
	}
	System.out.println(max+1);
}
}
