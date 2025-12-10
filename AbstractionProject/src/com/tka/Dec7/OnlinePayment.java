package com.tka.Dec7;

public abstract class OnlinePayment implements Payment{
	String transactionId;

	public OnlinePayment(String transactionId) {
		super();
		this.transactionId = transactionId;
	}
	void showTransactionId() {
		System.out.println("Transaction Id is: "+transactionId);
	}
}
