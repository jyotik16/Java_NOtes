package com;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2 * n - 1;
		int row = 1;
		int nst = 1;
		int pr = 1;
		while (row <= nr) {
			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");

			}
			// prep
			if (row <= nr / 2) {
				nst++;
			} else {
				nst--;
			}
			row = row + 1;
			System.out.println();
		}
	}
}
//*
//**
//***
//****
//***
//**
//*