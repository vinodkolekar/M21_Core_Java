package com.cg.inheritance;
//Program on multilevel inheritance
class Car
{
	//method
	void carType()
	{
		System.out.println("Engine is on petrol");
	}
}

class Tata extends Car
{
	public String brand="Tata";
	void brand()
	{
		System.out.println("Brand is: " +brand);
	}
}

class SUV extends Tata
{
	public int speed=50;
	void average()
	{
		System.out.println("The average: " +speed +" km/h");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		SUV s= new SUV();
		s.average();
		s.brand();
		s.carType();

	}

}
