package com.cg.polymorphism;
//Program on function/method overloading
class Triber
{
	int speed;
	String engine;
	Triber()    //zero parameter
	{
		System.out.println("Renault-kiger");
	}
	Triber(int speed, String engine)    //two parameter
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: " +speed+" km/hr" + "\nEngine is on: "+engine);
		
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t=new Triber();
		Triber t1=new Triber(45,"Petrol");

	}

}
