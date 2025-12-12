package com.tka.allExceptions;

public class AgeTooLowException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public AgeTooLowException() {
		super();
	}
	public AgeTooLowException(String s) {
		super(s);
	}


}
