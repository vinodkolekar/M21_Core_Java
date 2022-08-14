package com.cg.streamsoperations;

import java.util.Arrays;
import java.util.List;

public class StreamOperation 
{
	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(12,55,10,87,10,45,32,71);
		//distinct:- it takes unique values
		obj.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();   //we are using this line here so that next output can be print in next line
		
		//limit:- prints first n limit elements
		obj.stream().limit(5).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//sorted:- sorts elements in ascending order
		obj.stream().sorted().forEach(i->System.out.print(i+" "));
		System.out.println();
	}
}
