package com;

import java.util.ArrayList;

public class Permutation {
public static void main(String[] args) {
	String s = "abc";
	System.out.println(permute(s,""));;
	System.out.println(Subsequence(s));
}

private static ArrayList<String> Subsequence(String s) {
	if(s.length()==0) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("");
		return ar;
	}
	char ch = s.charAt(0);
	String ros = s.substring(1);
	ArrayList<String> rr = Subsequence(ros);
	ArrayList<String> mr = new ArrayList<>();
	for (String rrs : rr) {
		mr.add(rrs);
		mr.add(rrs+ch);
	}
	return mr;
}

private static ArrayList<String> permute(String s,String ans) {
	
	if(s.length()==0) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("");
		System.out.println(ans);
		return ar;
	}
	char ch  = s.charAt(0);
	String ros = s.substring(1);
	ArrayList<String> br = permute(ros,ans+ch);
	ArrayList<String> cr = new ArrayList<>();
	for(String rr:br) {
		for (int i = 0; i <= rr.length(); i++) {
			cr.add(rr.substring(0, i) + ch + rr.substring(i));
		}
	}
	return cr;
	
}
}
