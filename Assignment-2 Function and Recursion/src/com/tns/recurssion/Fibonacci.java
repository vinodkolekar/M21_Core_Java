package com.tns.recurssion;

import java.util.Scanner;

public class Fibonacci {

	static int fibonacci(int n)
	{
		
		if(n==0)
		{
			return (0);
		}
		else if(n==1)
		{
			return(1);
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
		
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n= s.nextInt();
		System.out.println("the term in fibonacci series is: " +fibonacci(n)); // function calling
		s.close();
		
	}

}
