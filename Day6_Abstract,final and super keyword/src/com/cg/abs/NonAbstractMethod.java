package com.cg.abs;

abstract class A
{
	//Declaring a class as abstract with no abstract methods means that we don't allow it to be instantiated on its own.
	//An abstract class used in Java signifies that we can't create an object of the class directly.
	void print()
	{
		System.out.println("Non-abstract method");
	}
}
class B extends A
{
	//As B is inheriting the properties of A class then it has print method
}

public class NonAbstractMethod {

	public static void main(String[] args) {

        B a=new B();
        a.print();
//		A a=new A();    //this won't work
//		a.print();
		

	}

}
