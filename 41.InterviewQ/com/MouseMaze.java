package com;

import java.util.Scanner;

public class MouseMaze {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		
		int [][] strg = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				strg[i][j] = scn.nextInt();
			}
		}
		System.out.println(cheeseMazePath(0,n-1,0,m-1,strg));
		//to search cheese which is equal to 9

		
	}
	public static int cheeseMazePath(int cr,int er,int cc,int ec,int[][] strg){
		int count=0;
		if(cr==er && cc==ec) {
			if(strg[cr][cc]==9)
				return 1;
			return 0;
		}
		if(cr>er || cc>ec) {
			return 0;
		} 
		if(strg[0][0]==0) {
			return 0;
		}
		
		if(strg[cr][cc]==9)
			return 1;	
		if(strg[cr][cc]==1) {	
		count+=cheeseMazePath(cr,er,cc+1,ec,strg);
		count+=cheeseMazePath(cr+1,er,cc,ec,strg);
		}	
		if(count>1) {
			count =1;
		}
		return count;
		
}
}
