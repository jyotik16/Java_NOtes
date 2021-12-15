package com;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=n/2;
        int nsp=2;
        while(row<=n)
        {
        	
          //stars
           for(int cst=1;cst<=nst;cst++)
            {
            	System.out.print("*");
            }
        //spaces
        for(int csp=1;csp<=nsp;csp++)
        {
        	System.out.print(" ");
        }
        //stars
        for(int cst=1;cst<=nst;cst++)
        {	System.out.print("*");
        	
        }
		//prep
        if(row<=n/2)
        {
        	nst--;nsp+=2;
        }
        else
       { 
        	nst++; nsp-=2;     
       }
       
        row=row+1;
        System.out.println();
        }
}
}

//**  **
//*    *
//      
//*    *
//**  **