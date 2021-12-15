package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Neutralisation_string {
public static void main(String[] args) {
	
	String s ="aaabbcccdccc";
	neutral(s); //ad
}

private static void neutral(String s) {
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(!map.containsKey(ch)) {
			map.put(ch,1);
		}else {
			int t = map.get(ch);
			map.put(ch,t+1);			
		}
			
	}	
	Set<Map.Entry<Character,Integer>> setMap = map.entrySet();
	
	for(Map.Entry<Character,Integer> EE:setMap) {
		int t = EE.getValue();
		System.out.println(EE.getKey()+"->"+EE.getValue());
		if(t%2!=0)
			System.out.println(EE.getKey());
	}
	
}
}
