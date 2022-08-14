package com.cg.lamexp;
import java.util.*;

public class ComparabeLambda {

	public static void main(String[] args) {
		//Lambda expression
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"abc","Shuwani","Nial"};
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str)
		{
			System.out.println(i);
		}
	}
}