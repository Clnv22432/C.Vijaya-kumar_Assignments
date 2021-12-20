package com.mav;

public abstract class BankActRImpl implements ActBankR{
	private void BankAccRepositoryImpl(){
		  ActBank bankaccount = new ActBank();
		  bankaccount.setAccountHolderName("Ram");
		  bankaccount.setAccountId(65);
		  bankaccount.setAccountType("Savings");
		  bankaccount.setAccountBalance((long) 6572.1);
	}


}
