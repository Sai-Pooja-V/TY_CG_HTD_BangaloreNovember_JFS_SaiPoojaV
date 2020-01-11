package com.cg.retailermaintenanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.retailermaintenanceapp.dao.ProductInfoDao;
import com.cg.retailermaintenanceapp.dto.ProductBean;

@Service
public class ProductInfoServiceImpl implements ProductInfoService{

	@Autowired
	private ProductInfoDao dao;
	
	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

}
