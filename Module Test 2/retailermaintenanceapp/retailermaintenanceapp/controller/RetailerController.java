package com.cg.retailermaintenanceapp.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.retailermaintenanceapp.dto.RetailerResponse;
import com.cg.retailermaintenanceapp.dto.UserBean;
import com.cg.retailermaintenanceapp.service.UserInfoService;

@RestController
public class RetailerController {
	@Autowired
	private UserInfoService service;

	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes =  MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse auth(@RequestBody UserBean bean) {
		UserBean userBean =service.auth(bean.getEmail(), bean.getPassword());

		RetailerResponse response = new RetailerResponse();
		if(userBean !=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Found For the credentials");
			response.setBeans(Arrays.asList(userBean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials Invalid");
		}
		return response;
	}
	
	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes =  MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse register(@RequestBody UserBean bean) {
		RetailerResponse response = new RetailerResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Registered");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Email already exists");
		}
		return response;
	}
	
	@GetMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes =  MediaType.APPLICATION_JSON_VALUE)
	public RetailerResponse changePassword(@RequestBody UserBean bean) {
		RetailerResponse response = new RetailerResponse();
		if(service.changePassword(bean.getEmail(), bean.getPassword())){
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password Changed");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password Not Changed");	
		}
		return response;	
	}
}
