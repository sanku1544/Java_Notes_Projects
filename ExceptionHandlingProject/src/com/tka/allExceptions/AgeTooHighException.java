package com.tka.allExceptions;

public class AgeTooHighException  extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public AgeTooHighException() {
		super();
	}
	public AgeTooHighException(String msg) {
		super(msg);
	}
}
