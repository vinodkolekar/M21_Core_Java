package com.cg.thiskeyword;
//this keyword is use to return current class instance
class Car
{
	int a,b;
	Car()
	{
	 a=10;
	 b=20;
	}
	Car get()
	{
		//method that returns current class instance
		return this;
	}
	void display()
	{
		System.out.println("The addition of and and b is: " +(a+b));
	}
}

public class ReturnCurrentClass {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.get().display();

	}

}
