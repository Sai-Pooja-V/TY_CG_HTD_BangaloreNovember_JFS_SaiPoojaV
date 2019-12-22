package com.cg.moduletest.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.cg.moduletest.bean.ProductBean;

public class ProductDaoImpl implements ProductDao {

	FileReader reader;
	Properties prop;
	ProductBean bean;

	public ProductDaoImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ProductBean> showAllProducts() {
		List<ProductBean> list = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				bean = new ProductBean();
				bean.setProductId(rs.getInt(1));
				bean.setProductName(rs.getString(2));
				bean.setProductCost(rs.getInt(3));
				bean.setProductColor(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNumberOfProducts(rs.getInt(6));
				list.add(bean);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductBean searchProduct(String productName) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))
				){
			pstmt.setString(1, productName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {

				bean = new ProductBean();
				bean.setProductId(rs.getInt(1));
				bean.setProductName(rs.getString(2));
				bean.setProductCost(rs.getInt(3));
				bean.setProductColor(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNumberOfProducts(rs.getInt(6));
			}
			return bean;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteProduct() {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"));
				){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Selected Product Name");
			String prodName = sc.next();
			pstmt.setString(1, prodName);

			int count = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
