package com;

public class CheckArraySum {
public static void main(String[] args) {
	int []ar = {1,6,4,1,2};
	fun(ar);
}

private static void fun(int[] ar) {
	
	int r_sum=0; int l_sum =0; int f=0;
	for(int i=0;i<ar.length;i++) {
		r_sum+=ar[i];
	}
	for(int i=0;i<ar.length;i++) {
		l_sum+=ar[i];
		r_sum-=ar[i];
		if(l_sum==r_sum) {
			f = 1;
			System.out.println("YES");
			break;
		}
	}
	if(f==0)
		System.out.println("NO");
}
}
