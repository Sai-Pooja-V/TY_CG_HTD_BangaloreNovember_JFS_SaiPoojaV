package com.cg.moduletest.services;

import java.util.List;

import com.cg.moduletest.bean.ProductBean;

public interface ProductServices {
	public List<ProductBean> showAllProducts();
	public ProductBean searchProduct(String productName);
	public boolean deleteProduct();
}
