package com.cg.thiskeyword;
//3. this keyword can be passes as an argument in method call
class B
{
	void print(B obj)
	{
		System.out.println("Function 1 is invoked");
	}
	void display()
	{
		print(this);
	}
}

public class MethodCall {

	public static void main(String[] args) {
		B obj= new B();
		obj.display();

	}

}
