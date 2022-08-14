package com.cg.inheritance;
//Program on hierarchical inheritance
class Mobile
{
	void displayName()
	{
		System.out.println("Brand is 'Moto' ");
	}
}

class Moto extends Mobile
{
	void display()
	{
		System.out.println("Moto one fusion plus ");
	}
}

class MotoG extends Mobile
{
	void display()
	{
		System.out.println("Moto 5G plus");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Moto m1= new Moto();
		MotoG m2= new MotoG();
		m2.display();
		m1.display();
		m1.displayName();
		
		
	}

}
