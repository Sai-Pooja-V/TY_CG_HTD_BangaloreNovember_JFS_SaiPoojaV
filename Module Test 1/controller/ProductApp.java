package com.cg.moduletest.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.moduletest.bean.ProductBean;
import com.cg.moduletest.factory.ProductFactory;
import com.cg.moduletest.services.ProductServices;

public class ProductApp {
	public static void main(String[] args) {
		ProductServices services = ProductFactory.instanceOfProductServices();
		ProductBean bean = new ProductBean();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Select\n1.Show all Products\n2.Search Product");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:List<ProductBean> list = services.showAllProducts();
			if(list != null) {
				for (ProductBean productBean : list) {
					System.out.println(productBean);
				}
			} 
			break;

			case 2: System.out.println("Enter Product Name to search");
			bean.setProductName(sc.next());
			
			ProductBean bean1 = services.searchProduct(bean.getProductName());
			if(bean1!=null) {
				System.out.println("Product Id is: "+bean1.getProductId());
				System.out.println("Product Name is: "+bean1.getProductName());
				System.out.println("Product Cost is: "+bean1.getProductCost());
				System.out.println("Product Color is: "+bean1.getProductColor());
				System.out.println("Description is: "+bean1.getDescription());
				System.out.println("Number of Products is: "+bean1.getNumberOfProducts());
				ProductSearch.productSearch();
			} else {
				System.out.println("Product not found");
			}
			break;
			}
		}
	}
}
