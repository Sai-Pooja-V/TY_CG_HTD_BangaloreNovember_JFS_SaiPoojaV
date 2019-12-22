package com.cg.moduletest.controller;

import java.util.Scanner;

import com.cg.moduletest.bean.ProductBean;
import com.cg.moduletest.factory.ProductFactory;
import com.cg.moduletest.services.ProductServices;

public class ProductSearch {
	public static void productSearch() {
		Scanner sc = new Scanner(System.in);
		ProductBean bean = new ProductBean();
		ProductServices services = ProductFactory.instanceOfProductServices();
		while(true) {
			System.out.println("Select\n1.Buy\n2.Search Again\n3.Main Menu");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter 16 digit card number");
			long cardNumber = sc.nextLong();
			System.out.println("Enter 3 digit CVV");
			int cvv = sc.nextInt();
			System.out.println("Product will be delieverd within 24 hours");
			services.deleteProduct();
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
			case 3: String [] str = {"Hello"}; 
			ProductApp.main(str); 
			break;
			}
		}
	}
}
