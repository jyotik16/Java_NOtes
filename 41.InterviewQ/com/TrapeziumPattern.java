package com;

public class TrapeziumPattern {

	public static void main(String[] args) {
		
		int n=3;
	
		pattern(n);
	}

	private static void pattern(int n) {
		 int i, j, k, s, a = 1,b = n*n + 1;
		 System.out.println("b="+b);
		for (i = n; i >= 1; i--) {
			// space
			for (s = 0; s < n - i; s++)
				System.out.print("  ");
			for (j = 0; j < i; j++)
				System.out.print(" * "+a++);
			
			b=b+1-(2*(i-1));
			for (k = 0; k < i - 1; k++)
				System.out.print(" & "+b++);
			System.out.print(" % "+b); // last b should without *
			if(i/2==0)
				b = b+i/2;
			else
				b = b+i/2+1;
			
			System.out.println();
         }            
	}
}
