package com.cg.exception;

import java.unil.scanner;
import java.util.Scanner;

public class ArithmeticException {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	try
	{
		int res=15/x;
		System.out.println(res);
		
	}
	catch(Exception)

}
