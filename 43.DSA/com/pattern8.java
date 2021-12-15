package com;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n;
		int nsp=0;
		int row=1;
			
		while (row <= n) {

			//stars
			int cst = 1;
			while (cst <= nst) {
				if ((row == cst) || (row + cst == n + 1))
					System.out.print("*");
				else
					System.out.print(" ");
				cst = cst + 1;
			}
			// prep
			row = row + 1;
			System.out.println();
		}

	    }

}
//*  *
// ** 
// ** 
//*  *