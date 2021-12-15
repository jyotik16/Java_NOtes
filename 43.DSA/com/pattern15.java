package com;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nr=2*n-1;
        int row=1;
        int nst=n;
        int nsp=1;
        while(row<=nr)
        {
        //spaces
        for(int csp=1;csp<=nsp;csp++)
        {
        	System.out.print(" ");
        	
        }
        //stars
        for(int cst=1;cst<=nst;cst++)
        {
        	System.out.print("*");
        	
        }
		//prep
        if(row<=nr/2)
        {	nsp+=2; nst--;
        
        }
        else
        {
		nsp-=2; nst++;
        }
        row=row+1;
        System.out.println();
}
}
}
//****
//   ***
//     **
//       *
//     **
//   ***
// ****