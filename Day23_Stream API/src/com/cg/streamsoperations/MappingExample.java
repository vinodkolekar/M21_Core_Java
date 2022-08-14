package com.cg.streamsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Apple ","Banana","Mango","Litchi"});
		System.out.println("Word length for object fruit");
		obj.stream().map(String::length).forEach(System.out::println);
		
//		List<Integer>obj1=Arrays.asList(new Integer[] {10,20,30,40,50,60});
		List<Integer>obj1=Arrays.asList(10,20,30,40,50,60);
		obj1.stream().map(i->i*i).collect(Collectors.toList()).forEach(i->System.out.print(i+" "));
	}
}
