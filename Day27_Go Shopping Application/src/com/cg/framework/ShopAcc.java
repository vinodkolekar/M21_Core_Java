package com.cg.framework;

public abstract class ShopAcc 
{
	private int accNo;
	private String accNm;
	private float charges;
	
	//constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	//abstract method book product
	abstract public void bookProduct(float charges);
	
	//normal method items
	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	//getter and setter
	public int getAccNo() 
	{
		return accNo;
	}
	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	
	public String getAccNm() 
	{
		return accNm;
	}
	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}
	
	public float getCharges() 
	{
		return charges;
	}
	public void setCharges(float charges) 
	{
		this.charges = charges;
	}
	
	
	//toString Method
	@Override
	public String toString() 
	{
		return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%f]", accNo, accNm, charges);
	}

	
	
	
}
