package com.mav;

public interface ActBankR {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);

}
