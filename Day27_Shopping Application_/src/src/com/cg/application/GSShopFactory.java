package com.cg.application;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{
	@SuppressWarnings("unused")
	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc p= new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return null;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		return null;
	}	
}