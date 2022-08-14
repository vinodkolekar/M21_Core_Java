package com.cg.operators;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// logical operator
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a= s.nextInt();
		System.out.println("Enter second integer: ");
		int b= s.nextInt();
		boolean result= (a>b && b<8);
		boolean result1= !(a<b);
		System.out.println("Result is: " +result);
		System.out.println("Result is: " +result1);
		s.close();

	}

}
