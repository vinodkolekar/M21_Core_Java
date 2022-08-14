package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) 
	{
		// compile and matcher method
		//for one pattern
		Pattern p=Pattern.compile("Programming");
		Matcher m=p.matcher("Java Programming is enough to get a job in IT Industry");
		
		//for two pattern
//		Pattern p1=Pattern.compile("Programming");
//		Matcher m1=p1.matcher("Java Programming is enough to get a job in IT Industry");
		while(m.find())
		{
			System.out.printf("Pattern found from: "+m.start()+" to "+(m.end()-1));   //end method -1 because the index starts with 0
		}
		
//		while(m1.find())
//		{
//			System.out.printf("Pattern found from: "+m1.start()+" to "+(m1.end()-1));   //end method -1 because the index starts with 0
//		}		
		//System.out.println("No pattern found");
	}
}
