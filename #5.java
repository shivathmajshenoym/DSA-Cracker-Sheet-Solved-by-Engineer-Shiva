// DSA ARRAY #5 Move all negative numbers to left side in an array

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
        
        NegativeToLeftSide(arr);
    }
    
    static void NegativeToLeftSide(int[] arr)
    {
        
        /*
            Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
            
                low                                 high
            Output: -12 -13 -5 -7 -3 -6 11 6 5
        */
        
        int left=0,right=arr.length-1;
        
        while (left <= right)
    {
         
        // Condition to check if the left
        // and the right elements are
        // negative
        if (arr[left] < 0 && arr[right] < 0)
            left++;
 
        // Condition to check if the left
        // pointer element is positive and
        // the right pointer element is negative
        else if (arr[left] > 0 && arr[right] < 0)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
 
        // Condition to check if both the
        // elements are positive
        else if (arr[left] > 0 && arr[right] > 0)
            right--;
        else
        {
            left++;
            right--;
        }
    }

        System.out.println("Element after Negative to Left : ");
        
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    }
}

