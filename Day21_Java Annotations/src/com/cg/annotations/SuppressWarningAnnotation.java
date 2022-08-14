package com.cg.annotations;

class Animal
{
	//Non-parameterised constructor
	Animal()
	{
		System.out.println("Lion");
	}
//	public void sound()
//	{
//		System.out.println("Peacock");
//	}
}
public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a=new Animal();
	}

}
