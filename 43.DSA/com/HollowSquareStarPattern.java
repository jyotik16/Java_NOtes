package com;

import java.util.Scanner;

public class HollowSquareStarPattern {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=4;
		int noS1=1,noS2=1;
		int noSP=4;
		
		while(row>0) {
			
			if(row==1 || row==4) {
				noS1=4; noSP=0; noS2=0;
			}else {
				noS1=1; noSP=4; noS2=1;
			}
			//star
			for(int i=0;i<noS1;i++) {
				System.out.print("* ");
			}
			//Space
			for(int i=0;i<noSP;i++) {
				System.out.print(" ");
			}
			//star
			for(int i=0;i<noS2;i++) {
				System.out.print("* ");
			}
			
			row--;
			System.out.println();
		}
		
	}
	
	
}
