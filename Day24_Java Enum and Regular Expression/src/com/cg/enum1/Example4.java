package com.cg.enum1;
//enum in terms of interface

interface Pizza
{
	void display();
}
enum Size implements Pizza
{
	Small, Medium, Large, ExtraLarge;
	public void display()
	{
		System.out.printf("Size is: " +this);
	}
}
public class Example4 
{
	public static void main(String[] args) 
	{
		Size.ExtraLarge.display();
	}
}