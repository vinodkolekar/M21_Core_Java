package com.cg.annoclass;
//Anonymous class

abstract class Annonymus
{
	public abstract void method();
}

public class Demo {

	public static void main(String[] args) {
		Annonymus a= new Annonymus()
		{
			
		public void method()
		{
			System.out.println("This is an example of an annonymus class");
		}
		};
		a.method();

	}

}
