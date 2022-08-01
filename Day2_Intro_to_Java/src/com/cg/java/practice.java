package com.cg.java;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=15;
//		int b=10;
//		int c=5;
//		int d=9;
//		var z=a+b;
//		System.out.print(a);
//		System.out.println("tula mahit ahe ka:" +b);
//		System.out.println(c);
//		System.out.println(d);
		Scanner vk=new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=vk.nextInt();
		
		if(num % 2 == 0)
			System.out.println("this is even number:"+num);
		else
			System.out.println("this is odd number:"+num);
		

	}

}
