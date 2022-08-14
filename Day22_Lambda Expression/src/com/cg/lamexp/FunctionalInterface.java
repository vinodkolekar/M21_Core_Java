package com.cg.lamexp;
interface A
{
	//Zero-parameter abstract method
	void show();
}
//class B implements  A
//{
//	public void show()
//	{
//		System.out.println("Lambda Expression");
//	}
//}
public class FunctionalInterface {

	public static void main(String[] args) {
//		B b=new B();
//		b.show();
		
		
		//using Lambda expression
		A obj=()->
		{
			System.out.println("Lambda Expression");
		};
		obj.show();
	}
}
