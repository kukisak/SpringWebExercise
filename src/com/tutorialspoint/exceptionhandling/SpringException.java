package com.tutorialspoint.exceptionhandling;

public class SpringException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7176042287612372662L;
	private String exceptionMessage;

	public SpringException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
}
