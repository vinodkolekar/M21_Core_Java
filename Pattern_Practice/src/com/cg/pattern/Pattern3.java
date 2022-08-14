package com.cg.pattern;

public class Pattern3 {

	public static void main(String[] args) 
	{
		//mirrored left angle triangle with number
		int i,j,k;
		int x=0;
		int n=5;
		for(i=1;i<=n; i++)
		{
			  for(j=0;j<=n-i; j++) 
			{
				  System.out.print(" ");  
			}
				  for(k=0;k<i; k++) 
				{
					System.out.print(x);
					x++;
				}
			 
			System.out.println();
		}

	}

}
