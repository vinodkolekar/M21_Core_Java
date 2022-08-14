package com.cg.instanceofoperator;

public class InstanceTypeClass {

	public static void main(String[] args) {
		
		InstanceTypeClass s= new InstanceTypeClass();
		System.out.println(s instanceof InstanceTypeClass);  //use same object; here if instead of s we use  other like s1, we won't get output

	}

}
