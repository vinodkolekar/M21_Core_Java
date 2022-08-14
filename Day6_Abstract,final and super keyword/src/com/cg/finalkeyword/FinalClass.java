package com.cg.finalkeyword;
//we cannot extend final class

//final class Vehicle
class Vehicle
{
	void display()
	{
          System.out.println("Vehicle type");
	}
}
class Bike extends Vehicle
{
	void print()
	{
		System.out.println("Bike");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		
		Bike b= new Bike();
		b.print();
		b.display();

	}

}
