package com.tns.function;

import java.util.Scanner;

public class Factorial {
	
	//function definition
	
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n;i++)
		{
		   fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n= s.nextInt();
		System.out.println("Factorial is: " +factorial(n)); // function calling
		s.close();
		
	}

}
