package com.cg.interfacee;

public interface InterfaceExample {
	//By default its abstract method
		void display();
}
class X implements InterfaceExample
{
	//provided the implementation for abstract method inside the Demo class
	public void display()
	{
		System.out.println("Interface Example");
	}
}
