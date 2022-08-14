package com.cg.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// assignment operator
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a= s.nextInt();
		System.out.println("Enter second integer: ");
		int b= s.nextInt();
		int result= (a*=b);
		System.out.println("Result is: " +result);
		s.close();

	}

}
