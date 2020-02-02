package com.cg.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.springrest.dto.EmployeeResponse;
import com.cg.springrest.exception.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	@ExceptionHandler(EmployeeException.class) //this will handle only EmployeeException exceptions
	public EmployeeResponse handleEmployeeException(EmployeeException e) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDiscription(e.getMessage()); //this will throw the same msg as we have written in custom exception
		return response;
	}
}
