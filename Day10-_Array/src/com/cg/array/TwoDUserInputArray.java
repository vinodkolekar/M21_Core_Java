package com.cg.array;

import java.util.Scanner;

public class TwoDUserInputArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the outside array size: ");
		int m= s.nextInt();
		System.out.println("Enter the inside array size: ");
		int n= s.nextInt();
		int arr[][]= new int[m][n];
		
		//to enter the element in the array
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter" +i+ " "+j+"value: ");
				arr[i][j]=s.nextInt();
			}
		}
				
		//two print the elements in 2D array
	    for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		s.close();
		

	}
	
}
