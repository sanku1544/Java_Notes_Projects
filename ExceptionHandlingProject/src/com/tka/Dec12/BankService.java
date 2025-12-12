package com.tka.Dec12;

import com.tka.allExceptions.InsuficientBalanceException;

public class BankService {
	void withdraw(Account account,int amount) throws InsuficientBalanceException {
		int balance= account.getBalance();
		if(amount>balance) {
			throw new InsuficientBalanceException("Insuficient balance");
		}
		else {
			account.setBalance(balance-amount);
			System.out.println("Withdraw of "+amount+" successful new balance: "+account.getBalance());
		}
	}
}
