package com.cg.enum1;
//enum in terms of if else condition

public class Example5 
{
	enum EmpType
	{
		Contract, Permanent, Temporary;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Permanent) 
		{
			System.out.printf("Permanent Employee");
		}
		else if(e==EmpType.Contract) 
		{
			System.out.printf("Contract-Based Employee");
		}
		else
		{
			System.out.printf("Temporary Employee");
		}
		
	}
	public static void main(String[] args) 
	{
		EmpType e= EmpType.Permanent;
		print(e);

	}

}
