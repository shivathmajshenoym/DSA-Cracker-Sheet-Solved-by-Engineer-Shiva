// Bonus Question: Add Two Numbers without '+Operator'

import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Two Numbers to Add");
		
		Scanner obj=new Scanner(System.in);
		
		int a=obj.nextInt();
		int b=obj.nextInt();
		
// 		a+b
// 		a+b-1+1 
// 		a-(-b+1)+1 
// 		a-~b-1
		
		int sum=a-~b-1;
		System.out.println("The Sum of  "+a+" and "+b+" is: "+sum);
	}
}
