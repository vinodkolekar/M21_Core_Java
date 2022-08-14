package com.cg.interfacee;

interface Inff 
{
	//By default its abstract method
	void display();
	

}
class Demo implements Inff
{
	//provided the implementation for abstract method inside the Demo class
	public void display()        //public has to be there,  its must here in the class implementing interface. You can not create void x() without public.
	{
		System.out.println("Interface");
	}
}
public class Main
{
	public static void main(String arg[])
	{
		Demo d=new Demo();
		d.display();
	}
}
