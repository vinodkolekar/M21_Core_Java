package com.cg.interfacee;
//Multiple Inheritance
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Daughter implements Mother, Father
{

	@Override
	public void print() {
		System.out.println("My father's name is Joynal");
		
	}

	@Override
	public void display() {
		System.out.println("My mother's name is Salma");
		
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.print();
		d.display();

	}

}
