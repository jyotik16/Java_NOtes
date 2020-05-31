package com;

public class pascalTriangle2 {
public static void main(String[] args) {
	int n=4;
	fun(n);

}
private static void fun(int n) {
	
	int num =1;
	for(int i=0;i<=n;i++) {
		num=1;
		for(int sp=n;sp>i;sp--)
			System.out.print(" ");
		for(int j=0;j<=i;j++) {
			System.out.print(num+" ");
			num = num *(i-j)/(j+1);
		}
		System.out.println();
	}

}
}

