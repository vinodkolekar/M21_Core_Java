package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		//
		
		System.out.println(obj);
		//2type casting is not required in generics
		List<String>obj1=new LinkedList<String>();
		//
		obj1.add("vinod");
		obj1.add("vk");
		String str=obj1.get(1);
		//
		//
		System.out.println(str);
		

	}

}
