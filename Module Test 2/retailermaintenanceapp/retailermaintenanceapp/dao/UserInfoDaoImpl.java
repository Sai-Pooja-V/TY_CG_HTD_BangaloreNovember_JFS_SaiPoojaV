package com.cg.retailermaintenanceapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.cg.retailermaintenanceapp.dto.UserBean;
import com.cg.retailermaintenanceapp.exceptions.RetailerAppException;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public UserBean auth(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		String jpql = "from UserBean where email = :email and password =:password ";
		TypedQuery<UserBean> query = entityManager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			UserBean bean = query.getSingleResult();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(encoder.matches(password, bean.getPassword())) {
			return bean;
		}else {
			throw new RetailerAppException("Password invalid");
		}
		}catch (Exception e) {
			throw new RetailerAppException("Email invalid");
		}
	}

	@Override
	public boolean register(UserBean bean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();  
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			throw new RetailerAppException("Email already exists");
		}
	}

	@Override
	public boolean changePassword(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		UserBean bean = entityManager.find(UserBean.class, email);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

}
