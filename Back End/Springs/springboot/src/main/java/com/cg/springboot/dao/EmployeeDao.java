package com.cg.springboot.dao;
import com.cg.springboot.dto.EmployeeBean;

import java.util.List;

public interface EmployeeDao {
	public EmployeeBean auth(String email, String password);
	public boolean register(EmployeeBean bean);
//	public EmployeeBean getEmployee(String email);
//	public List<EmployeeBean> getEmployees(String name);
	public List<EmployeeBean> getEmployees(String key);
	public boolean changePassword(int id, String password);
	public boolean deleteEmployee(int id);
}
