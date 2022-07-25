// DSA ARRAY #4 Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm 

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        int arr[]={2,0,2,1,1,0};
        
        SortZeroOneTwoArr(arr);
    }
    
    static void SortZeroOneTwoArr(int[] arr)
    {
        
        /*
            2 0 2 1 1 0
            
            after sorting 0 0 1 1 2 2
            
            low mid high1
        */
        
        int low=0,mid=0,high=arr.length-1;
        
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                mid++; high--;
            }
        }
        
        System.out.println("Elements of Array after sorting: ");
        
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    }
}

