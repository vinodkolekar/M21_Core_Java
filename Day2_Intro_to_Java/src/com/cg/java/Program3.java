package com.cg.java;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				//System.out.println("*"+" ");  
				System.out.print(i); 

			}
		}

	}
}
