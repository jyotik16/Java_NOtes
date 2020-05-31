package com;

import java.util.Scanner;

public class targetsumpair {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		int sum = scn.nextInt();
		targetsum(arr, sum);
	}

	public static int[] takeinput(int size) {
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {

			ar[i] = scn.nextInt();
		}
		return ar;
	}

	public static void targetsum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			int p = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[j] + p) == sum)
				{
					if(p>arr[j])
					System.out.println(arr[j]+ " and " +p);
					else
					System.out.println(p + " and " + arr[j]);
			   }
			}
		}

	}
}
