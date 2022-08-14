package com.cg.application;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) 
	{
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) 
	{
		return null;
	}
}