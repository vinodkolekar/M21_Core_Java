package com.cg.streamsoperations;

import java.util.*;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) 
	{
		//Stream can be created with static data
		 Stream<String>obj=Stream.of("Shabnam ","Ashlesha ","Vaibhav");
		 obj.forEach((i)->System.out.print(i));
		 System.out.println();
		 
		 //Stream can be acquired from array or collections
		 List<String>obj1=Arrays.asList(new String[] {"Mumbai ","Pune","Nagpur"});
		 obj=obj1.stream();
		 //obj.forEach((i)->System.out.print(i));    //it will print output in same line with previous output
		 obj.forEach(System.out::println);   //to print this out in new new  line

	}
}
