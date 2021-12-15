package com;

import java.util.Scanner;

public class Pattern14a {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 2*n;
		int nr = 1;
		int cst = 1;
		while(nr<row) {
			
		for(int nst=0;nst<cst;nst++) {
				System.out.print("*");
			}
			
		if(nr<row/2) {
			cst++;
		}else if(nr>=row/2) {
			cst--;
		}
		nr++;
	System.out.println();	
	}
		
	}
	
}
