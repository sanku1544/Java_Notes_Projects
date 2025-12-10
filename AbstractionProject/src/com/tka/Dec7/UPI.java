package com.tka.Dec7;

public class UPI extends OnlinePayment {

	public UPI(String transactionId) {
		super(transactionId);
		
	}

	@Override
	public void pay() {
		System.out.println("Payment succesful using UPI: "+super.amt);
		
	}

}
