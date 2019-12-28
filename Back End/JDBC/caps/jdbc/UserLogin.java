package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
//		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			//Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded....");
			
			//Get DB connection via driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection established.......");
			
			//Issue sql queries via connection
//			String query = "select * from users_info where userid = 2019002 and password = 'pooja12'";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(query);
//			System.out.println("Query issued and executed");
			String query = "select * from users_info where "
					+ "userid = ? and password = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter Userid......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password....");
			pstmt.setString(2, sc.nextLine());
			
			rs = pstmt.executeQuery();
			System.out.println("Query issued and executed");
			System.out.println("------------------------------");
			
			//Process the results returned by sql queries
			if(rs.next()) {
				System.out.println("Userid: "+rs.getInt(1));
				System.out.println("Username: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
			}else {
				System.err.println("Something went wrong......");
			}
			sc.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//close all JDBC Objects
		finally {
			try {
				if(conn != null) 
					conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
			try {
//				if(stmt != null)
//					stmt.close();
				if(pstmt != null)
					pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs != null)
					rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}	
	}
}
