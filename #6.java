// DSA ARRAY #6 Find Union and Intersection of Two Arrays

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
        // Initialise two arrays
        int arr1[]={1,2,4,5,6};
        int arr2[]={5,4,7,8,9};
        
        HashSet <Integer>h = new HashSet<>();
        /* Initialise HashSet that means storing elements in array without repeation */
        
        for(int i=0;i<arr1.length;i++)
        {
            h.add(arr1[i]); //adding first array elements into an array
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            h.add(arr2[i]); //adding second array elements into an array
        }
        
        System.out.println("Union of Two Arrays are: "+h+"\n");// print Union set of two Array
        
        HashSet <Integer>h1 = new HashSet<>();
        /* Initialise HashSet that means storing elements in array without repeation */
        
        System.out.println("Intersection of Two Arrays are: ");
        
        for(int i=0;i<arr1.length;i++)
        {
            h1.add(arr1[i]); //adding first array elements into an array
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(h1.contains(arr2[i]))
            {
                System.out.print(arr2[i]+" ");
            }
        }
        
    }
    
}
