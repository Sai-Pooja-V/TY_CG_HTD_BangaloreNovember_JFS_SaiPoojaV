package com.caps.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		Properties prop = null;
		try {
			reader = new FileReader("db.properties");
			prop = new Properties(); 
			prop.load(reader);
			//load the driver
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver Loaded.....");
			
			//get db connection
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			//Process the result returned
			while(rs.next()) {
				System.out.println("UserId: "+rs.getInt("userid"));
				System.out.println("UserName: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("*****************************");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
