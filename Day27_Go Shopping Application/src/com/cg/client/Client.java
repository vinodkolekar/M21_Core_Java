package com.cg.client;
import com.cg.application.*;
import com.cg.framework.*;

public class Client 
{
	public static void main(String[] args) 
	{
		//ShopFactory s= new GSShopFactory();
		PrimeAcc p= new GSPrimeAcc(3245, "Janhvi", 200, true);
		NormalAcc n= new GSNormalAcc(1221,"Sambhaji", 750, 50);
		//for prime Account output
		System.out.println("Prime Account");
		p.bookProduct(p.getCharges());
		
		//for normal Account output
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		
		System.out.println(p);
		System.out.println(n);
	}
}