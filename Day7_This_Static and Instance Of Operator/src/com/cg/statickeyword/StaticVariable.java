package com.cg.statickeyword;
//static keyword in terms of variable(to change value of variable already initialized before)
public class StaticVariable {
	static int a=10;

	public static void main(String[] args) {
		//change the value of a or reinitialized
		a=12;
		System.out.println(a);

	}

}
