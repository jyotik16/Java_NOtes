package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class DirectINputFromCommandLine {
public static void main(String[] args) throws NumberFormatException, IOException {
	Scanner sc = new Scanner(System.in);
	
//	int ar[] = {1,1,1,1};
//	String str="";
//	for(int aa:ar) {
//		str = str+aa;
//	}
//	System.out.println(str);
//	int a = Integer.parseInt(str);
//	System.out.println(a);
//	
//	int rem=0,ans=0,mul=1;
//	while(a!=0) {
//		rem = a%10;
//		ans = ans+(rem*mul);
//		a =a/10;
//		mul = mul*2;
//	}
//	System.out.println(ans);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int t = Integer.parseInt(br.readLine().trim());
//    String s[]=br.readLine().split(" ");
//    System.out.println(s[0]);
    char[] chars = new char[] {'\u0097'};
    String str = new String(chars);
    byte[] bytes = str.getBytes();
    System.out.println(Arrays.toString(bytes)); //63
	

}
}
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
             int n= Integer.parseInt(br.readLine().trim());
              String s[]=br.readLine().split(" ");
              int a[]=new int[n];long sum=0;int max=0;
              for(int i=0;i<n;i++){
                  a[i]=Integer.parseInt(s[i].trim());
                  sum+=a[i];
                  if(max<a[i]){
                      max=a[i];
                  }
              }
              
              if((sum-max)>max){
                  System.out.println("Yes");
              }else{
                  System.out.println("No");
              }
        }
*/