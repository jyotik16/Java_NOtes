package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DupliacteInArray {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int m = sc.nextInt();
//		int [] arr = new int[m];
//		
//		for(int i=0;i<m;i++) {
//			arr[i] = sc.nextInt();
//			
//		}
//		int[] ar= {10,40,20,30,10};
//		int[] br= {50,40,20,30,20,10};
//		Intersection(ar,br);
		int[] ar= {2,12,9,10,16,3,20,25,11,1,8,6,21,22,24};
		LongestSequence(ar); //[8, 9, 10, 11, 12]
//		CoinTossprint(2,"");
		
	}
public static int CoinTossprint(int toss,String ans) {
	if (toss == 0) {
		System.out.println(ans);
		return 1;
	}
	 
	int h=CoinTossprint(toss - 1,ans+"H");
	int t=CoinTossprint(toss - 1,ans+"T");		
	return h+t;
	
}
public static void DuplicateInArray(int[] ar) {
	HashMap<Integer,Integer> hr = new HashMap<>();
	int max=0; int duplicateitem=0;
	for(int i=0;i<ar.length;i++) {
		
			if(!hr.containsKey(ar[i])) {
				hr.put(ar[i],1);
			}else {
				int temp=hr.get(ar[i]);   
				hr.put(ar[i],temp+1);
			
				if(max<temp+1) {
					max=temp+1;
					duplicateitem = ar[i];
				}
		}
	}
	System.out.println("dupliCate:"+duplicateitem+" max="+max);
}
 
public static void Intersection(int[] ar,int[] br) {
	HashMap <Integer,Integer> map =new HashMap<>();
	ArrayList <Integer> ans = new ArrayList<>();
	for(int i=0;i<ar.length;i++) {
		int a=ar[i];
		if(!map.containsKey(a)) {
			map.put(a, 1);
		}else {
			int temp=map.get(a);
			map.put(a,temp+1);
		}
	}
	for(int j=0;j<br.length;j++) {
		int b=br[j];
		if(map.containsKey(b) && map.get(b)>0) {
			ans.add(b);
			int temp=map.get(b);
			map.put(b,temp-1); //if again number is come 
		}
	}
	System.out.println(ans);
	 
}

public static void LongestSequence(int[] ar) {
	HashMap <Integer,Boolean> map =new HashMap<>();
	ArrayList <Integer> ans1 = new ArrayList<>();
	ArrayList <Integer> ans2 = new ArrayList<>();
	int max=0,len1=0,len2=0;
	boolean flag=true;
	for (int i = 0; i < ar.length; i++) {
		int a = ar[i];
		if (!map.containsKey(a)) {
			map.put(a, true);
		}
		if (max < ar[i])
			max = ar[i];
	}
	System.out.println(map);
	for (int j = 1; j <= max; j++) {

		if (map.containsKey(j) && flag==true) {
			ans1.add(j);
			len1++;
		} 
		
		else if(map.containsKey(j) && flag==false) {
			ans2.add(j);
			len2++;
		}
		else {
			
			if(len1<len2) {
				flag=true;
				ans1=new ArrayList<>();
				len1=0;
			}else {
				flag=false;
				ans2=new ArrayList<>();
				len2=0;
			}
		}
//		System.out.println("ans1="+ans1);
//		System.out.println("ans2="+ans2);
	}
	if(len1>len2)
		System.out.println(ans1);
	else
		System.out.println(ans2);
		

}
}
