package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Anagrams {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();	
    String p = sc.nextLine();
    //int res = getCountOfOccurencesOfAnagrams(p,s);
	//System.out.println("res="+res);
   fun(s,p);
}

private static int getCountOfOccurencesOfAnagrams(String s1, String s2)
{
    HashMap<Character, Integer> h = new HashMap<Character, Integer>();
    HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();

    int c = 0;
    
    for(int i = 0; i < s2.length(); i++)
    {
        if(!h1.containsKey(s2.charAt(i)))
        {
            h1.put(s2.charAt(i), 1);
        }
        else
        {
            h1.put(s2.charAt(i), h1.get(s2.charAt(i)) + 1);
        }
    }
    //printmap(h1);
    for(int i = 0; i < s1.length(); i++)
    {
        if(!h.containsKey(s1.charAt(i)))
        {
            h.put(s1.charAt(i), 1);
        }
        else
        {
            h.put(s1.charAt(i), h.get(s1.charAt(i)) + 1);
        }
    }
   // printmap(h);
    if(h.equals(h1))
    {
        c++;
    }
    int min=-1,tem=0;
    for(int i=0;i<s2.length();i++) {
    	
    	if(h.containsKey(s2.charAt(i))) {
    		tem=h1.get(s2.charAt(i));
    		if(min<tem){
    			min=tem;
    		}
    	}
    }
    for(int i = s2.length(); i < s1.length(); i++)
    {
        if(h.get(s1.charAt(i - s2.length())) == 1)
        {
            h.remove(s1.charAt(i - s2.length()));
        }
        else
        {
            h.put(s1.charAt(i - s2.length()), h.get(s1.charAt(i - s2.length())) - 1);
        }
        
        if(!h.containsKey(s1.charAt(i)))
        {
            h.put(s1.charAt(i), 1);
        }
        else
        {
            h.put(s1.charAt(i), h.get(s1.charAt(i)) + 1);
        }
        
        if(h.equals(h1))
        {
            c++;
        }
    }
    
    return min;
}

static void printmap(HashMap<Character,Integer> map) {
Set<Map.Entry<Character,Integer>> setMap = map.entrySet();
	
	for(Map.Entry<Character,Integer> EE:setMap) {
		int t = EE.getValue();
		System.out.println(EE.getKey()+"->"+EE.getValue());
		
	}
}

static void fun(String str1,String str2) {
	int n = str1.length();
    int m = str2.length();
    System.out.println("m="+m);
	int[] arr1 = new int[256];
    int[] arr2 = new int[256];
    for(int i=0;i<m;i++){
        arr1[str1.charAt(i)]++;
        arr2[str2.charAt(i)]++;
    }
	int count=0;
    for(int i=m;i<n;i++){
        if(compare(arr1,arr2)){
            count++;
        }
        arr1[str1.charAt(i)]++;
        arr1[str1.charAt(i-m)]--;
    }
    if(compare(arr1,arr2)){
            count++;
    }
    System.out.println(count);
}

static boolean compare(int[] arr1,int[] arr2){
    for(int i=0;i<256;i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
    }
    return true;
}
}
