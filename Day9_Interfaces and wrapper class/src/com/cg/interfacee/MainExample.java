package com.cg.interfacee;

interface Vehicle
{
	//abstract method
	void speed();
}
interface Car extends Vehicle  // when we are using 2 interface and we are going to access one interface from another interface we have to use "extends" keyword and not "implements" keyword
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}

	@Override
	public void speed() {
		System.out.println("Speed is 40 kn/hr");
		
	}
}

public class MainExample {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.speed();

	}

}
