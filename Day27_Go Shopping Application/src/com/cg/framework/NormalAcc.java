package com.cg.framework;

public abstract class NormalAcc extends ShopAcc 
{
	//fields
	private final float deliveryCharges;
	
	//constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Account No is: " +this.getAccNo() +" and account name is: "+this.getAccNm());
		System.out.println("Charges is:   " +(charges+ deliveryCharges));
	}
	
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}        
}
