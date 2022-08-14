package com.cg.streamsoperations;
import java.util.Arrays;
import java.util.List;

public class FilterOperation 
{
	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,55.78f,87.33f);
		System.out.println(obj);
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);	
	}
}
