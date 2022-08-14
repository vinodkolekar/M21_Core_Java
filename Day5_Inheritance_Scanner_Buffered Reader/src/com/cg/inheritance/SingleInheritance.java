package com.cg.inheritance;
// Program on single inheritance
class Bike
{
	public int speed=50;
	//method
	void speed()
	{
		System.out.println("The speed of bike is : " +speed +"km/h");
	}
}
//Inheritance
class Pulsar extends Bike
{
	void average()
	{
		System.out.print("Good");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Pulsar p=new Pulsar();
		p.speed();
		p.average();

	}

}
