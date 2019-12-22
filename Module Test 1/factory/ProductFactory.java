package com.cg.moduletest.factory;

import com.cg.moduletest.dao.ProductDao;
import com.cg.moduletest.dao.ProductDaoImpl;
import com.cg.moduletest.services.ProductServices;
import com.cg.moduletest.services.ProductServicesImpl;

public class ProductFactory {

	private ProductFactory() {

	}

	public static ProductDao instanceOfProductDAOImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductServices instanceOfProductServices() {
		ProductServices services = new ProductServicesImpl();
		return services;
	}

}
