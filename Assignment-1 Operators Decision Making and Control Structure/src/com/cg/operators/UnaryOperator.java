package com.cg.operators;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		// Unary operator
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a= s.nextInt();
		System.out.println("Enter second integer: ");
		int b= s.nextInt();
		
		int x=a++;
		int y=++b;
		int z=a+x+y;
		
		int m=--a;
		int n=b--;
		int o=n-m;
		System.out.println("Result is: " +z);
		System.out.println("Result is: " +o);
	    s.close();

	}

}
