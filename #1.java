//  DSA ARRAY #1 Reverse the array 

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        
        System.out.println("Enter Elements into an empty Array");
        
        Scanner obj=new Scanner(System.in); // Initialised Scanner Object to fetch Array elements
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        
        System.out.println("Elements entered into this array are: ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nElements of Array in Reverse order are: ");
        
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}

