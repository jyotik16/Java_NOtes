package com;

import java.util.Scanner;

public class LRU {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] frame = new int[3];
		int m = sc.nextInt();
		int [] ar = new int[m];
		
		for(int i=0;i<m;i++) {
			ar[i] = sc.nextInt();
			
		}
		frame[0] = ar[0];
		frame[1] = ar[1];
		frame[2] = ar[2];
		int pointer=0,f=0,count=3;
		
		for(int i=3;i<m;i++) {
			
		for(int j=0;j<frame.length;j++) {
			if(frame[j] == ar[i]) {
				f = 1;
			}
		}
		if(f==0) {
			frame[pointer] = ar[i];
			System.out.println("f="+frame[pointer]);
			pointer++;
			if(pointer>2) {
				pointer = pointer%3;
			}
			count++;
		}
		f = 0;
			
		}
		System.out.println(count);
		
	}
	
}
