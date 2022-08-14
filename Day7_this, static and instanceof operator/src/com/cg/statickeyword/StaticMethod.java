package com.cg.statickeyword;

public class StaticMethod {
	//static method:; without creating the object we can call that method by making the given method name as static
	static void print()
	{
		System.out.println("Welcome to static keyword concept");
	}

	public static void main(String[] args) {
		//staticMethod m=new StaticMethod();
		//m.print();
		print();
	}

}
