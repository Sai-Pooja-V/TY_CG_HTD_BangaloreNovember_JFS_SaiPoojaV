package com.cg.empspringmvc.dao;

import java.util.List;

import com.cg.empspringmvc.beans.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean auth(String email, String password);
	public boolean register(EmployeeBean bean);
//	public EmployeeBean getEmployee(String email);
//	public List<EmployeeBean> getEmployees(String name);
	public List<EmployeeBean> getEmployees(String key);
	public boolean changePassword(int id, String password);
}
