package com.cg.moduletest.dao;

import java.util.List;

import com.cg.moduletest.bean.ProductBean;

public interface ProductDao {
	public List<ProductBean> showAllProducts();
	public ProductBean searchProduct(String productName);
	public boolean deleteProduct();
}
