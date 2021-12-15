package com;

public class MirrorInverse {
public static void main(String[] args) {
	int ar[] = {3,5,1,2,4,6,7};
	mirror(ar);
}
	
	private static void mirror(int[] ar) {
	int br[] = new int[ar.length];
	for(int i=0;i<ar.length;i++) {
		int t = ar[i];
		br[t-1] = ar[i];
		
	}
	print(br);
	}

	private static void print(int ar[]) {
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
