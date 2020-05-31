package com;

public class ArraySplit {

	static int findSplitPoint(int arr[], int n)
    {
    int leftSum = 0;
     
    for (int i = 0 ; i < n ; i++)
        leftSum += arr[i];
     // again traverse array and compute right 
    // sum and also check left_sum equal to 
    
    int rightSum = 0;
         for (int i = n-1; i >= 0; i--)
         {
        
        rightSum += arr[i];
        // exclude current element to the left_sum
        leftSum -= arr[i] ;
 
        if (rightSum == leftSum)
            return i ;
         }
 
    // if it is not possible to split array
    // into two parts.
    return -1;
    }
 
    // Prints two parts after finding split 
    // point using findSplitPoint()
    static void printTwoParts(int arr[], int n)
    {
        int splitPoint = findSplitPoint(arr, n);
       
        if (splitPoint == -1 || splitPoint == n )
        {
            System.out.println("Not Possible" );
            return;
        }
        for (int i = 0; i < n; i++)
        {
            if(splitPoint == i)
                System.out.println();
                 
            System.out.print(arr[i] + " ");
        }
        System.out.println("i="+splitPoint);
    }
 
    
    public static void main (String[] args) {
     
    
    
    int arr[] = {4,1,0,1,1,0,1};
    int brr[] = {1,3,2,2};
    
    int n = brr.length;
     
    printTwoParts(brr, n);
         
    }

}
