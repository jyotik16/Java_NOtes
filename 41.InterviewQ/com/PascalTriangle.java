package com;

public class PascalTriangle {

	public static void main(String[] args) {
		
		int n=7;
		Pascal(n);
		
	}

	private static void Pascal(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(Cofficent(i,j)+" ");
			}
			System.out.println();
		}
		
	}

	private static int Cofficent(int n, int k) {
		int res = 1; 
        
        if (k > n - k) 
        k = n - k; 
              
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
		
	}
}
