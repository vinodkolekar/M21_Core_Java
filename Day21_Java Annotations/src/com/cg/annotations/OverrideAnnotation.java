package com.cg.annotations;
//@Override annotation is giving the extra information about the method
class Car
{
	void speed(int s)
	{
		System.out.println("Speed is: "+s+"km/hr");
	}
}
class BMW extends Car
{
	@Override
	void speed(int s)
	{
		System.out.println("Speed is: "+s+"kn/hr");
	}
}
public class OverrideAnnotation
{
	public static void main(String[] args) {
		BMW b=new BMW();
		b.speed(60);
		//here it is accessing speed method of child class (not parent class) as in run time polymorphism it access child class method
		//this program is an example of run time polymorphism
	}
}
