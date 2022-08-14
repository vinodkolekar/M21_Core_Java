package com.tns.recurssion;

import java.util.Scanner;

public class FactorialRecurssion {

	
		static int factorial(int n)
		{
			if(n==1)
			{
				return (1);
			}
			else
			{
				return n*factorial(n-1);
			}
		}
			
		public static void main(String[] args) {
		
			Scanner s= new Scanner(System.in);
			System.out.println("Enter value of n: ");
			int n= s.nextInt();
			System.out.println("Factorial is: " +factorial(n)); // function calling
			s.close();
			
		}
}
