package com.cg.homeworkassignment;

import java.util.Scanner;

public class Program2_Enhanced_for_loop {

	public static void main(String[] args) {
		// Enhanced for loop
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int n=s.nextInt();
		System.out.println("Enter array elements: ");
		int arr[]=new int[n];
		//to enter the array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		//to print the array elements
		for(int i:arr)
		{
			System.out.println(i);
			
		}
        s.close();

	}

}
