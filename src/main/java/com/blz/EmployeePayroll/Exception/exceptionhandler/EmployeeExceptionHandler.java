package com.blz.EmployeePayroll.Exception.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.blz.EmployeePayroll.Exception.EmployeeNotFoundException;
import com.blz.EmployeePayroll.Util.Response;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Response> handleHiringException(EmployeeNotFoundException he){
		Response response = new Response();
        response.setErrorCode(400);
        response.setMessage(he.getMessage());
        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
	
//@ControllerAdvice
//public class MethodArgumentNotValidException {
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//		public ResponseEntity<Response> handleHiringException(EmployeeNotFoundException he){
//			Response response = new Response();
//	        response.setErrorCode(400);
//	        response.setMessage(he.getMessage());
//	        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
//		
//}
