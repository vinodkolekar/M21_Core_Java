package com.cg.lamexp;
interface L
{
	int add(int a, int b);
}

public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//Lambda expression without returning a value
		L obj=(int a, int b)->(a*b);
		System.out.println(obj.add(5,2));
	}
}
