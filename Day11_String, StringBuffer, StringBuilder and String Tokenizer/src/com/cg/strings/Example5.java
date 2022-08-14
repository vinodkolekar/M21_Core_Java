package com.cg.strings;
//Program to find length of string
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter string: ");
	    String str1=s.nextLine();
	    System.out.println(str1.length());
	    System.out.println(str1.charAt(4));
	    System.out.println(str1.toUpperCase());
	    System.out.println(str1.toLowerCase());
	    
	    //to concatenate string
	    System.out.println(10+20+"hello"+" "+"world!"+"10+20"+" "+ 10+20);  //different types of concatenate in one line
	    System.out.println("Enter string 2: ");
	    String str2=s.nextLine();
	    System.out.println(str1.concat(str2));
	    
	    s.close();
	}
	

}
