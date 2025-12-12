package com.tka.Dec12;

import com.tka.allExceptions.InsuficientBalanceException;

public class Test {

	public static void main(String[] args) {
		
		int balance= 500;
		int amt=900;
		if(amt>balance) {
			
			throw new InsuficientBalanceException("Insuficient Balance");
		}else {
			balance=balance-amt;
			System.out.println("Withdraw succesfull remaining balance is: "+balance);
		}
		System.out.println("Thank you");

	}

}
