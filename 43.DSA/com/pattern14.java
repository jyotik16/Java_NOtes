package com;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int startn=3;
		int nr = 2 * n - 1;
		int row = 1;
		int nst = 1;
		while (row <= nr) {
			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(startn);

			}
			// prep
			if (row <= nr / 2) {
				nst++; startn++;
			} else {
				nst--;startn--;
			}
			row = row + 1;
			
			System.out.println();
		}
	}
}
//4
//
//3
//44
//555
//6666
//555
//44
//3