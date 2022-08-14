package com.cg.pattern;

public class Pattern4 {

	public static void main(String[] args)
	{
		// left right angle triangle
		int i,j;
		int n=5;
		for(i=0;i<n; i++)
		{
			for(j=0;j<=i; j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
