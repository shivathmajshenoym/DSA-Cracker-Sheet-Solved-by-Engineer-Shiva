// DSA ARRAY #7 Cyclically Rotate Array Elements One by One

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        
        CyclicallyRotateArray(arr);
    }
    
    static void CyclicallyRotateArray(int[] arr)
    {
        int left=arr.length-2,right=arr.length-1;
        
        while(right>0)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left--;
        }
        
        System.out.print("Elements of Array After Cyclical Rotation is:");
        
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}