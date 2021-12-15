package com;

public class Pattern31 {

	public static void main(String[] args) {
		
		int n=3;
		/*
		 * 	 * 1 * 2 * 3 * 4 & 17 & 18 & 19 % 20
   * 5 * 6 * 7 & 14 & 15 % 16
     * 8 * 9 & 12 % 13
       * 10 % 11
		 */
		pattern(n);
	}

	private static void pattern(int n) {
		 int i, j, k, s, a = 1,b = n*n + 1;
		for (i = n; i >= 1; i--) {
			// space
			for (s = 0; s < n - i; s++)
				System.out.print("  ");
			for (j = 0; j < i; j++)
				System.out.print(" * "+a++);
			for (k = 0; k < i - 1; k++)
				System.out.print(" & "+b++);
			System.out.print(" % "+b); // last b should without *
			b=b-( 2 * (i - 1));
			System.out.println();
         }            
	}
}
