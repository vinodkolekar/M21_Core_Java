package com.cg.operators;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		// bitwise operator
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a= s.nextInt();
		System.out.println("Enter second integer: ");
		int b= s.nextInt();
		int result= a&b ;
		int result1= a|b;
		int result2= a^b;
		int result3= a<<b;
		int result4= a>>b;
		System.out.println("Result is: " +result);
		System.out.println("Result is: " +result1);
		System.out.println("Result is: " +result2);
		System.out.println("Result is: " +result3);
		System.out.println("Result is: " +result4);
		s.close();

	}

}
