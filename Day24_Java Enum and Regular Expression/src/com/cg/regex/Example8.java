package com.cg.regex;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str="M-21 \r\n Shabnam Mondal \r\n PCCOE";     // '\' is escape character | you can also use anything, it is  just string splitter
		String[] res=str.split("\r\n");
		for(String i: res)
		{
			System.out.println(i);
		}
		s.close();
	}
}
