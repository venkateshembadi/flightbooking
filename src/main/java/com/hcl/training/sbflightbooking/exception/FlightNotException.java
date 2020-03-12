package com.hcl.training.sbflightbooking.exception;

public class FlightNotException extends RuntimeException {
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
