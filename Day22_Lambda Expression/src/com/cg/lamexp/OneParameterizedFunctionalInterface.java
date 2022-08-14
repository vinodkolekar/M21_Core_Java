package com.cg.lamexp;
//Functional Interface which contains only one abstract method
interface Z
{
	//
	String print(String str);
}
public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		// Lambda Expression
		@SuppressWarnings("unused")
		Z obj=(String str)->
		{
			return str;
		};
		System.out.println("One Parameterized Functional Interface");
	}
}
