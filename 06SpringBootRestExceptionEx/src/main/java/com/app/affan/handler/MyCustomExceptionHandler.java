package com.app.affan.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.affan.bean.MyErrorResponse;
import com.app.affan.exception.ProductNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler {

	/*
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> showCustomErroMsg(
			ProductNotFoundException pnfe
			)
	{
		return new ResponseEntity<String>(
				pnfe.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
	*/
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustomErroMsg(
			ProductNotFoundException pnfe
			)
	{
		return new ResponseEntity<MyErrorResponse>(
			    new MyErrorResponse(new Date().toString(), "Exception in Process", 500, pnfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
