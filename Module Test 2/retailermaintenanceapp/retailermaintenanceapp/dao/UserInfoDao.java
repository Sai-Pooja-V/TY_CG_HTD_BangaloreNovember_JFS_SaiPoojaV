package com.cg.retailermaintenanceapp.dao;

import com.cg.retailermaintenanceapp.dto.UserBean;

public interface UserInfoDao {
	public UserBean auth(String email, String password);
	public boolean register(UserBean bean);
	public boolean changePassword(String email, String password);
}
