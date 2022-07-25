//  DSA ARRAY #2 Find the maximum and minimum element in an array 

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        int arr[]={10,290,1,43,81,32,10,100};
        
        FindMaxAndMin(arr);
        
    }
    
    static void FindMaxAndMin(int[] arr)
    {
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            
            if(arr[i]<min)
                min=arr[i];
        }
        
        System.out.println("Maximum element of an Array is: "+max);
        
        System.out.println("Minimum element of an Array is: "+min);
        
        
    }
}

