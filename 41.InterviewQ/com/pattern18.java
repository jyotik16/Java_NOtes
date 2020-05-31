package com;

import java.util.Scanner;

public class pattern18 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=5;
        int row=1;
        int nst=1;
        int nsp=n-1;
        while(row<=n)
        {
        	
            //spaces
        for(int csp=1;csp<=nsp;csp++)
        {
        	System.out.print("   ");
        }
        //stars
        for(int cst=1;cst<=nst;cst++)
        {	
        	System.out.print(" * ");
        	
        }	
         

		//prep
        if(row<=n/2)
        {
        	nst=nst+2; nsp--;
        }
        else if(row>n/2)
       { 
        	nst=nst-2; nsp++;     
       }
       
        row=row+1;
        System.out.println();
        }
}
}
//
//		   * 
//		*  *  * 
//	 *  *  *  *  * 
//		*  *  * 
//		   * 

