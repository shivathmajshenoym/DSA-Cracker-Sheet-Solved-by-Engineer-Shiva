// Bonus Question: Substract Two Numbers without '-' Operator'

import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Two Numbers to Substract");
		
		Scanner obj=new Scanner(System.in);
		
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		int sub=~b; //1's compliment
		sub=sub+1; // 2's compliment
		sub=a+sub; 
		System.out.println("The Substraction of  "+a+" and "+b+" is: "+sub);
	}
}
