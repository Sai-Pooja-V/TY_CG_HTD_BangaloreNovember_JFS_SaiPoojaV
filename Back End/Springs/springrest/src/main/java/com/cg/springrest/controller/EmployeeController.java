package com.cg.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springrest.dto.EmployeeBean;
import com.cg.springrest.dto.EmployeeResponse;
import com.cg.springrest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
	//public EmployeeBean auth(@RequestBody EmployeeBean bean) {
//			return service.auth(bean.getEmail(), bean.getPassword());
//	  }
	public EmployeeResponse auth(@RequestBody EmployeeBean bean) {   //this can be done in controller or service
		EmployeeBean employeeBean = service.auth(bean.getEmail(), bean.getPassword());
		EmployeeResponse response = new EmployeeResponse();   //one per operation i.e., one per method
		if(employeeBean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Employee found for the credentials");
			response.setBeans(Arrays.asList(employeeBean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Invalid credentials");
		}
		return response;
	}
	
	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public boolean register(@RequestBody EmployeeBean bean) {
//		return service.register(bean);
//	}
	public EmployeeResponse register(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Employee registered");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Email already exists");
		}
		return response;
	}
	
	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<EmployeeBean> searchEmployee(@RequestParam("key")String key) {
//		return service.getEmployees(key);
//	}
	public EmployeeResponse searchEmployee(@RequestParam("key")String key) {
		List<EmployeeBean> employeeBean =  service.getEmployees(key);
		EmployeeResponse response = new EmployeeResponse();
		if(employeeBean.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Data not found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Employee Data found");
			response.setBeans(employeeBean);
		}
		return response;
	}
	
	@PutMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public boolean changePassword(@RequestBody EmployeeBean bean) {
//		return service.changePassword(bean.getId(), bean.getPassword());
//	}	
	public EmployeeResponse changePassword(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.changePassword(bean.getId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Employee password changed");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Employee password not changed");
		}
		return response;
	}	
	
	@DeleteMapping(path="/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		service.deleteEmployee(id);
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Employee Detils Deleted");
		return response;
	}
}


























