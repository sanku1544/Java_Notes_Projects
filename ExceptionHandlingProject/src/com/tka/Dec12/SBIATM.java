package com.tka.Dec12;

import com.tka.allExceptions.InsuficientBalanceException;

public class SBIATM {
	public static void main(String[] args) {
		System.out.println("Welcome to SBI ATM");
		
		Account user= new Account(1290,48551565,"Sanket");
		BankService bank=new BankService();
		try {
		bank.withdraw(user, 1400);
		}
		catch(InsuficientBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}


