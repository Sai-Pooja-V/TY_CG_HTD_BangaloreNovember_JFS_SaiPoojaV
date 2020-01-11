package com.cg.retailermaintenanceapp.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.retailermaintenanceapp.dto.RetailerResponse;
import com.cg.retailermaintenanceapp.exceptions.RetailerAppException;

@RestControllerAdvice
public class RetailerControllerAdvice {
	@ExceptionHandler(RetailerAppException.class)
	public RetailerResponse handleEmployeeResponseException( RetailerAppException e) {
		RetailerResponse response = new RetailerResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
