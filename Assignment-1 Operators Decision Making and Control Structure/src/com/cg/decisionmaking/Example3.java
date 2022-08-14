package com.cg.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		// nested if...else
		
		int age=15, weight=130;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("Extra rope will be added");
				}
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}
		

	}

}
