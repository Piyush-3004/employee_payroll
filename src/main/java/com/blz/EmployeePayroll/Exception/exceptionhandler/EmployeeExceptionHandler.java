package com.blz.EmployeePayroll.Exception.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.blz.EmployeePayroll.Exception.EmployeeNotFoundException;
import com.blz.EmployeePayroll.Exception.MethodArgumentNotValidException;
import com.blz.EmployeePayroll.Util.Response;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Response> MethodArgumentNotValidException(MethodArgumentNotValidException exception){
		
//		List<ObjectError> errorList =exception.getBindingResult().getAllErrors();
		
		Response response = new Response();
		response.setErrorCode(400);
		response.setMessage(exception.getLocalizedMessage());
		return new ResponseEntity<Response>(response,HttpStatus.BAD_REQUEST);
		
	}
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
