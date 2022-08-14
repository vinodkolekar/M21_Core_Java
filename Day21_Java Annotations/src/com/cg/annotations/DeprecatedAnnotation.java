package com.cg.annotations;

class A
{
	@Deprecated
	//it allows any element or method no longer to be used
	public void print()
	{
		System.out.println("Hey there!");
	}
}
public class DeprecatedAnnotation
{
	public static void main(String[] args) {
		A a=new A();
		a.print();
	}
}
