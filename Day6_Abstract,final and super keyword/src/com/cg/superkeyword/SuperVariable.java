package com.cg.superkeyword;
//Super keyword:- it is used to access parent class instance variable
class Mobile
{
	protected String name="Samsung";    //protected is an access specifier. Its means string name can be access in parent class and child class also
}
class Samsung extends Mobile
{
	String name="Galaxy M31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		
		Samsung s=new Samsung();
		s.display();



	}

}
