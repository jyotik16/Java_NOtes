package com;

import java.util.ArrayList;
import java.util.List;


public class FirstRepeatCharacter {
public static void  main(String[] args) {

String s = "ababcd";
int a=1,b=12,c=3;
int es = (a>b?a:b)>c?(a>b?a:b):c;
System.out.println(es);
System.out.println(firstNonRepeatingChar(s));;
	
}
public static char firstNonRepeatingChar(String word) {

	List<Character> repeating = new ArrayList<>(); 
	
	List<Character> nonRepeating = new ArrayList<>(); 
	for (int i = 0; i < word.length(); i++) 
	{ 	char letter = word.charAt(i); 
		if (repeating.contains(letter))
			{ continue; } 
		if (nonRepeating.contains(letter)) 
			{ 	nonRepeating.remove((Character) letter); 
				repeating.add(letter);
			} 
			else 
			{ 
				nonRepeating.add(letter); 
			}
	}  
	
	//return nonRepeating.get(0); 
	return repeating.get(0);
	}
}
