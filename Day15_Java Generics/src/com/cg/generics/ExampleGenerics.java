package com.cg.generics;

import java.util.HashMap;
import java.util.Map;

public class ExampleGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj=new HarshMap<Integer,String>();
		obj.put(1,"vinod");
		obj.put(2, "vk");
		System.out.println(obj);

	}

}
