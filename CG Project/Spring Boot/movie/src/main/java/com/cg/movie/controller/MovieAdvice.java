package com.cg.movie.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.movie.bean.MovieResponse;
import com.cg.movie.exception.AdminException;

@RestControllerAdvice
public class MovieAdvice {
	
	@ExceptionHandler(AdminException.class)
	public MovieResponse handleCustomException(AdminException e) {
		MovieResponse response = new MovieResponse();
		response.setStatusCode(501);
		response.setDescription(e.getMessage());
		response.setMessage("Exception");
		return response;
	}
}
