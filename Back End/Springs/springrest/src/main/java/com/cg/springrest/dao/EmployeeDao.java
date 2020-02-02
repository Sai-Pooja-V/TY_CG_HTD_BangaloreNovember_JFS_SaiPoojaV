package com.cg.springrest.dao;

import java.util.List;

import com.cg.springrest.dto.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean auth(String email, String password);   //search or login
	public boolean register(EmployeeBean bean);    //add
//	public EmployeeBean getEmployee(String email);
//	public List<EmployeeBean> getEmployees(String name);
	public List<EmployeeBean> getEmployees(String key);   
	public boolean changePassword(int id, String password);
	public boolean deleteEmployee(int id);
}
