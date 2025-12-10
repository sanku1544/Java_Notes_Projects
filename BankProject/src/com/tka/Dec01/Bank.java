package com.tka.Dec01;

public class Bank {
		private String accountHolderName;
		private Long accountNumber;
		private double balance;
		public Bank(String accountHolderName, Long accountNumber, double balance) {
			super();
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		
		void withdraw(double amt) {
			if(amt>=0) {
				if(balance>=amt) {
					if(amt<=10000) {
			balance=balance-amt;
			System.out.println("Amount withdraw successfully: "+amt);
					}else {
						System.out.println("You can withdraw only 1 lakh at a time");
					}
					
				}else {
					System.out.println("Inificient balance");
				}
			}
			else {
				
				System.out.println("Value should not negative");
			}
		}
		void deposite(double amt) {
			if(amt>=0) {
				
			balance=balance+amt;
			System.out.println("Amount deposited successfully: "+amt);
				
			}else {
				
				System.out.println("Value should not negative");
			}
		}
		double getBalance() {
			return balance;
		}
}
