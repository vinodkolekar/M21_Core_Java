package com.cg.thiskeyword;
//this keyword is use to invoke current class constructor

class X
{
	int a;
	X()
	{
		this(20);  
		System.out.println("Inside default constructor");
	}
	X(int a)
	{
		this.a=a;
		System.out.println("Inside parameterized constructor");
		System.out.println("Value of a is: " +a);
		
	}
}

public class InvokeCurrentClassConstructor {

	public static void main(String[] args) {
		X x=new X();
	//as in object we are not passing any parameter/argument that why it will call X(). But as this(20) has a parameter so it will jump to
	//X(int a) as its a parameterized constructor	

	}

}
