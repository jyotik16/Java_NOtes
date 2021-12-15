package com;

public class MaximumSumSquence {
public static void main(String[] args) {
	int arr[]= {8, 2, 3, 5, 7, 9, 10}; 
	fun(arr,arr.length);
}

private static void fun(int arr[], int n) {
	 
        if (n == 1) 
            {System.out.println(arr[0]); ; 
            return;
            }
       // create two empty array that store result of 
       // maximum sum of alternate sub-sequence 
       
        // stores sum of decreasing and increasing 
        // sub-sequence 
        int dec[] = new int[n]; 
          
       
        // store sum of increasing and decreasing sun-sequence 
        int inc[] = new int[n]; 
       
        // As per question, first element must be part 
        // of solution. 
        dec[0] = inc[0] = arr[0]; 
       
        int flag = 0 ; 
       
        // Traverse remaining elements of array 
        for (int i=1; i<n; i++) 
        { 
            for (int j=0; j<i; j++) 
            { 
                // IF current sub-sequence is decreasing the 
                // update dec[j] if needed. dec[i] by current 
                // inc[j] + arr[i] 
                if (arr[j] > arr[i]) 
                { 
                    dec[i] = Math.max(dec[i], inc[j]+arr[i]); 
                    System.out.println("dec "+i+" ->"+dec[i]);
                    // Revert the flag , if first decreasing 
                    // is found 
                    flag = 1; 
                } 
       
                // If next element is greater but flag should be 1 
                // i.e. this element should be counted after the 
                // first decreasing element gets counted 
                else if (arr[j] < arr[i] && flag == 1) 
       
                    // If current sub-sequence is increasing 
                    // then update inc[i] 
                    inc[i] = Math.max(inc[i], dec[j]+arr[i]); 
                System.out.println("inc "+i+" ->"+inc[i]);
            } 
        } 
        print(inc);
        System.out.println();
        print(dec);
       
        // find maximum sum in b/w inc[] and dec[] 
        int result = Integer.MIN_VALUE; 
        for (int i = 0 ; i < n; i++) 
        { 
            if (result < inc[i]) 
                result = inc[i]; 
            if (result < dec[i]) 
                result = dec[i]; 
        } 
       
        // return maximum sum alternate sun-sequence 
    System.out.println(result);; 
   
	
}
private static void print(int ar[]) {
	
	for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
}
}
/*
8 0 13 16 20 24 25 
8 10 11 13 15 0 0 25
*/