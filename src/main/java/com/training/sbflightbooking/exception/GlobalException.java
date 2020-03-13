package com.training.sbflightbooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=FlightNotException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorResponse> handleException(FlightNotException exception) {
		ErrorResponse error=new ErrorResponse();
		error.setErrorMessage("Unable to process request");
		error.setStatusCode(exception.getMessage());
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}

}
