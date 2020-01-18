package com.cg.retailermaintenanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.retailermaintenanceapp.dao.UserInfoDao;
import com.cg.retailermaintenanceapp.dto.UserBean;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao dao;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserBean auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(UserBean bean) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(String email, String password) {
		return dao.changePassword(email, password);
	}

}
