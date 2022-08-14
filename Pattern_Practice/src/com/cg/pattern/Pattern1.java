package com.cg.pattern;

public class Pattern1 {

	public static void main(String[] args) 
	{
		// for reverse left right angle triangle
		    int i,j;
			int n=5;
			for(i=0;i<n; i++)
			{
				for(j=4;j>=i; j--)
				{
					System.out.print("@"+" ");
				}
				System.out.println();
			} 

	}

}
