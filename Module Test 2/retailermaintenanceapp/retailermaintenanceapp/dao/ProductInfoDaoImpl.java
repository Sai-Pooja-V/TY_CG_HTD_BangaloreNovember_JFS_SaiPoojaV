package com.cg.retailermaintenanceapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.retailermaintenanceapp.dto.ProductBean;
import com.cg.retailermaintenanceapp.exceptions.RetailerAppException;

@Repository
public class ProductInfoDaoImpl implements ProductInfoDao{

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public ProductBean searchProduct(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean where id =: id";
		TypedQuery<ProductBean> query = entityManager.createQuery(jpql, ProductBean.class);
		query.setParameter("id", id);
		try {
			ProductBean bean = query.getSingleResult();
			return bean;
		}catch (Exception e) {
			throw new RetailerAppException("Product Id invalid");
		}
	}

}
