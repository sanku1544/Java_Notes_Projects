package com.tka.Dec01;

public class Test {

	public static void main(String[] args) {
		
		Bank b1=new Bank("Sanket",755145225L,50);
		System.out.println("-----------------------------------------");
		b1.deposite(109950);
		System.out.println("-----------------------------------------");

		b1.withdraw(10.25);
		System.out.println("-----------------------------------------");

		double amt=b1.getBalance();
		System.out.println("Bank current balance is: "+amt);
		System.out.println("-----------------------------------------");


	}

}
