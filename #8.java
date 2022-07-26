// DSA ARRAY #8 Max Contiguous Subarray Sum

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,-2,5};
        
        MaxContiguosSubarraySum(arr);
    }
    
    static void MaxContiguosSubarraySum(int[] arr)
    {
        int maxSum=0,sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(maxSum>sum)
            {
                sum=maxSum;
            }
            if(maxSum<0)
            {
                sum=0;
            }
        }
        
        System.out.print("Max Contiguous Subarray Sum is: "+sum);
        
    }
}