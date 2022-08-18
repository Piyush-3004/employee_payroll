package com.blz.EmployeePayroll.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.blz.EmployeePayroll.Model.EmployeePayrollModel;
import com.blz.EmployeePayroll.Util.Response;

@ResponseStatus
public class MethodArgumentNotValidException extends RuntimeException{

	private int statusCode;
	private String statusMessage;

	public MethodArgumentNotValidException(MethodArgumentNotValidException status) {
		super(status);
	//	this.statusCode = status.getCause()
		this.statusMessage = status.getMessage();
	}

	public MethodArgumentNotValidException(int i, String string, Response response) {
		this.statusCode=i;
		this.statusMessage=string;
	}

}
