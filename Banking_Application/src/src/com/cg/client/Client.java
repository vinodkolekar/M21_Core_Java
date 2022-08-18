package com.cg.client;
import com.cg.application.*;
import com.cg.framework.*;

public class Client 
{

	public static void main(String[] args) 
	{
		SavingAcc s= new MMSavingAcc(12345, "Vinod", 12300, true);
		CurrentAcc c= new MMCurrentAcc(11111, "Sachin", 32100, 56700);
		
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		System.out.println(s.getAccNm());
		System.out.println(s.getAccNo());
		s.toString();
		
		System.out.println();
		
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		System.out.println(c.getAccNm());
		System.out.println(c.getAccNo());
		c.toString();	
		
		System.out.println();
		System.out.println(s);
		System.out.println(c);
	}
}