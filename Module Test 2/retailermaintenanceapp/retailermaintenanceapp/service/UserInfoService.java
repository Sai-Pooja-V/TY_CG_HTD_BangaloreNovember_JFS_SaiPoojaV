package com.cg.retailermaintenanceapp.service;

import com.cg.retailermaintenanceapp.dto.UserBean;

public interface UserInfoService {
	public UserBean auth(String email, String password);
	public boolean register(UserBean bean);
	public boolean changePassword(String email, String password);
}
