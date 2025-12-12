package com.tka.allExceptions;

public class InsuficientBalanceException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public InsuficientBalanceException() {
		super();
	}
	
	public InsuficientBalanceException(String msg) {
		super(msg);
	}
}
