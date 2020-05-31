package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PolygonExits {
	public static void main(String args[] ) throws Exception {
	       
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
       
       
    }
}
/*
 * 1
3
4 3 2
Yes
*/
