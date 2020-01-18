package com.cg.retailermaintenanceapp.dto;

import java.util.List;

public class RetailerResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<UserBean> beans;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserBean> getBeans() {
		return beans;
	}

	public void setBeans(List<UserBean> beans) {
		this.beans = beans;
	}

}
