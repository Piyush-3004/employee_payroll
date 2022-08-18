package com.blz.EmployeePayroll.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class MethodArgumentNotValidException extends RuntimeException{

	private int statusCode;
	private String statusMessage;

	public MethodArgumentNotValidException(int statusCode, String statusMessage) {
		super(statusMessage);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}

}
