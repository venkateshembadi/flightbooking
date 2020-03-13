package com.training.sbflightbooking.exception;

public class FlightNotException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public FlightNotException() {

	}

	public FlightNotException(String errorMessage) {
		super(errorMessage);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
