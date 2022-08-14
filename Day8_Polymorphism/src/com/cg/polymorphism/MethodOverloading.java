package com.cg.polymorphism;
//Program on function/method overloading: (a)by changing the numbers of arguments
class Shape
{
	int area(int a)
	{
		return a*a;   //whenever we use  return type as integer, always include return statement
	}
	int area(int a,int b)
	{
		return a*b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println(s.area(5));
		System.out.println(s.area(10,20));

	}

}
