package com.cg.decisionmaking;

public class Example2 {

	public static void main(String[] args) {
		// cascaded if...else
		
				int a=4, b=5, c=20;
				if (a>b && a>c)
				{
					System.out.println(a);
				}
				else if(b>a && b>c)
				{
					System.out.println(b);
				}
				else
				{
					System.out.println(c);
				}

	}

}
