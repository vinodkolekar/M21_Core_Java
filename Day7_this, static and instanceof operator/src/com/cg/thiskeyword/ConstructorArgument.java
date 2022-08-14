package com.cg.thiskeyword;
//2. this keyword can be passed as an argument in the constructor call
class A
{
	public int a;       //as we are declaring variable in class and also using the variable inside method or constructor,then we use this  keyword inside method and constructor
	/*A()
	{
		
	}*/
	A(int a)
	{
		this.a=a;
	}
}
public class ConstructorArgument {

	public static void main(String[] args) {
		 A obj=new A(5);
		 System.out.println("The value of a is : "+obj.a);
	}

}
