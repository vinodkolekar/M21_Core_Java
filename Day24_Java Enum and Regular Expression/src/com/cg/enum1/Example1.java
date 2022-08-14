package com.cg.enum1;
//enum used outside class
enum Car
{
	Mercedes, BMW, Audi;
}
public class Example1 {

	public static void main(String[] args) {
		Car c=Car.BMW;
		System.out.println(c);
	}
}
