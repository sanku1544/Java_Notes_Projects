package com.tka.Dec12;

public class Account {
	private int balance;
	private int accNo;
	private String accHolderName;
	
	public Account(int balance, int accNo, String accHolderName) {
		super();
		this.balance = balance;
		this.accNo = accNo;
		this.accHolderName = accHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + "]";
	}
	
	
	
	
}
