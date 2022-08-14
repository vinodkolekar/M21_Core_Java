package com.cg.finalkeyword;
//final method is inherited but not override
class X
{
	final void run()
	{
          System.out.println("Hello");
	}
}

public class FinalMethodInherited extends X{

	public static void main(String[] args) {
		
		FinalMethodInherited f=new FinalMethodInherited();
		f.run();

	}

}
