package com.cg.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer>obj=new ArrayList<>();
		obj.add(11);
		obj.add(13);
		obj.add(15);
		System.out.println(obj);
		//size of array
		System.out.println(obj.size());
	
		System.out.println(obj.contains(15.30));
		System.out.println(obj.indexOf(13));
		System.out.println(obj.lastIndexOf(11));
		

	}

}
