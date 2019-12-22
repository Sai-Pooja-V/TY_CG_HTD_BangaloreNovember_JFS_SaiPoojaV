package com.cg.moduletest.services;

import java.util.List;

import com.cg.moduletest.bean.ProductBean;
import com.cg.moduletest.dao.ProductDao;
import com.cg.moduletest.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices{

	ProductDao dao = ProductFactory.instanceOfProductDAOImpl();

	@Override
	public List<ProductBean> showAllProducts() {
		return dao.showAllProducts();
	}

	@Override
	public ProductBean searchProduct(String productName) {
		return dao.searchProduct(productName);
	}

	@Override
	public boolean deleteProduct() {
		return dao.deleteProduct();
	}

}
