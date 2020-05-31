package com;

import java.util.Scanner;

public class MatrixInterchange {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	int r=sc.nextInt(); int c=sc.nextInt();
	int ar[][] = new int[r][c];
	Input(r,c,ar);
	Interchange(ar,r,c);
	
}

private static void Interchange(int[][] ar, int r, int c) {
	
	int t=0,k,temp;
    for(k=0;k<r;k++)
    {
    temp=ar[k][0];
    ar[k][0]=ar[k][c-1];
    ar[k][c-1]=temp;
    }
    for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
            System.out.print(ar[i][j] + " ");
        }
        System.out.println();
    } 
	
}

private static void Input(int r,int c,int ar[][]) {
	
	
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			ar[i][j] = sc.nextInt();
		}
	}
	
}

}
