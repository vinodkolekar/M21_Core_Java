package com.cg.streamsoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		//List<Integer>obj1=Arrays.asList(new Integer[] {10,20,30,40,50,60});   //this can also be used
		List<Integer>obj1=Arrays.asList(-1,20,30,4,50,60);
		Optional<Integer>obj2=obj1.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
		if(obj2.isPresent())
		{
			System.out.println("Result: "+obj2.get());
		}
	}
}
