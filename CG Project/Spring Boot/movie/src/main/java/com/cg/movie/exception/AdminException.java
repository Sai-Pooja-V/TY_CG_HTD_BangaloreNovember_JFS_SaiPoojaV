package com.cg.movie.exception;

public class AdminException extends RuntimeException{
	String message;

	public AdminException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
