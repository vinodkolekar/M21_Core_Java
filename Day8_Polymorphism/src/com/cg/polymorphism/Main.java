package com.cg.polymorphism;
//Method overriding
class Parent
{
   void m1()
   {
        System.out.println("Parent - m1");
   }
}
public class Main extends Parent
{
    void m1()
    {
        System.out.println("Child - m1");
    }
    void m2()
    {
        System.out.println("Child - m2");
    }

	public static void main(String[] args) {
		Parent p = new Main();
        p.m1();
        Main c = new Main();
	    c.m2();

	}

}
