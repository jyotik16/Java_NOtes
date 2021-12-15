package com;

import java.util.Scanner;

public class Pattern10 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int nst=(n*2)-1;
	int nsp=1;
	int row=1;
		
	while(row<=n)
	{
		int csp=1;
		while(csp<nsp)	
	{
	System.out.print(" ");
	csp=csp+1;
	}
		int cst=1;
		while(cst<=nst)
		{ 
			System.out.print("*");
			cst=cst+1;
		}
		//prep
	nsp=nsp+1;
	nst=nst-2;
	row=row+1;
	System.out.println();
	}
	
    }
}
//*******
// *****
//  ***
//   *