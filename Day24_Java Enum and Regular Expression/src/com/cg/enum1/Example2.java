package com.cg.enum1;

//enum used inside class
public class Example2 
{
	enum Margin
	{
		Top, Bottom, Left, Right;
	}

	public static void main(String[] args) {
		int count=1;
		for(Margin m: Margin.values())
		{
			System.out.printf("Margin: %d %s\n", count++,m);
		}
	}
}
