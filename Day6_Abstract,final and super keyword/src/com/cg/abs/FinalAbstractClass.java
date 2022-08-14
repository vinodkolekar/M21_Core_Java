package com.cg.abs;
//we can not make any abstract class as final in java
//final abstract class Car
abstract class Car
{
	abstract void display();
}
class Audi extends Car
{
	void display()
	{
         System.out.println("Audi");
	}
}

public class FinalAbstractClass {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.display();

	}

}
