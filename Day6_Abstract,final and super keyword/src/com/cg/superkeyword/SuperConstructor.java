package com.cg.superkeyword;
//Super keyword:- it is used to invoke parent class constructor
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}
class Rose extends Flower
{
	Rose()
	{
		//we are invoking parent class constructor
		//first give the preference to constructor call and then print the statement
		super();
		System.out.println("Rose is Red");
	}
}
class Lily extends Flower
{
	Lily()
	{
		super();
		System.out.println("Lily");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		
		Rose r= new Rose();
		Lily l= new Lily();
		

	}

}
