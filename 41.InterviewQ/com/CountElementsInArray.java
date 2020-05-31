package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountElementsInArray {

	public static void main(String[] args) {
		
		int ar[] = {1,1,3,3,2,4};
		DuplicateInArray(ar,2);
	}
	public static void DuplicateInArray(int[] ar,int item) {
		HashMap<Integer,Integer> hr = new HashMap<>();
		
		for(int i=0;i<ar.length;i++) {
			
				if(!hr.containsKey(ar[i])) {
					hr.put(ar[i],1);
				}else {
					int temp=hr.get(ar[i]);   
					hr.put(ar[i],temp+1);
				
					
			}
		}
		
		if(hr.containsKey(item)) {
			int freq = hr.get(item);
			
			System.out.println(freq);
		}else {
			System.out.println("Not Present");
		}
		
		Set<Map.Entry<Integer,Integer>> ss = hr.entrySet();
		for(Map.Entry<Integer, Integer> ee:ss) {
			System.out.println(ee.getKey()+"->"+ee.getValue());
		}
		
		
	}
}
