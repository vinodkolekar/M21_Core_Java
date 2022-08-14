package com.cg.loopingiteration;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// for loop
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=s.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			System.out.println(+i);
		}
        s.close();
	}

}
