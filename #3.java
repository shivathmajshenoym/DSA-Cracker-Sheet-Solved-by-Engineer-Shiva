//  DSA ARRAY #3 Find the Kth Largest and Smallest Element from an Array

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        int arr[]={5,8,12,7,6,2,4};
        
        FindKthMaxAndKthMin(arr,1);
    }
    
    static void FindKthMaxAndKthMin(int[] arr,int k)
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])  // sorting logic in descending order
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
            
            if(i==k-1)
            {
                System.out.println("Kth - Maximum element of an Array is: "+arr[i]);
                break;
            }
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])  // sorting logic in descending order
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
            
            if(i==k-1)
            {
                System.out.println("Kth - Minimum element of an Array is: "+arr[i]);
                break;
            }
        }
    
    }
}

