package com.cg.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// switch case

		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Ram");
			break;
		case 2:
			System.out.println("Shyam");
			break;
		case 3:
			System.out.println("Raju");
			break;
		case 4:
			System.out.println("Mohan");
			break;
		default:
			System.out.println("Invalid");			
		}s.close();
		
		
	}

}
