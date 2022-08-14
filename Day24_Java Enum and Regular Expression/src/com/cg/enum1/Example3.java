package com.cg.enum1;
// enum in terms of switch case

enum Bike
{
	Pulsar, KTM, R3, R15;
}
public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.KTM;
		switch(b)
		{
		case Pulsar:
			System.out.printf("You choose Pulsar");
			break;   //if you do not give the break statement then it will print next statement also
		case KTM:
			System.out.printf("You choose KTM");
			break;
		case R3:
			System.out.printf("You choose R3");
			break;
		case R15:
			System.out.printf("You choose R15");
			break;
		default:
			System.out.printf("Invalid option");
		}
	}
}
