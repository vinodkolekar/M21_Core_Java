package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
		//int arr[]=new int[5];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		//to enter the elements in the array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter " +i +" value: ");
			arr[i]=s.nextInt();
		}
		s.close();
		
		//to print array value we gave as input
		for(int x:arr)
		{
			System.out.println(x);
		}

	}

}
