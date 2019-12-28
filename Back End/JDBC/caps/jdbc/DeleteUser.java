package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//load the driver
//			Driver d = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(d);
			//instead of DriverManager
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded......");
			
			//get the db connection via driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter the user and password: ");
			String user=sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection established.....");
			
			//issue the sql query via connection
			String query = "delete from users_info "
					+ "where userid = ? and password = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter Userid......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password....");
			pstmt.setString(2, sc.nextLine());
			
			//process the results returned by query
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("User Deleted......");
			}else {
				System.err.println("Something went wrong.......");
			}
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//close all jdbc objects
		finally {
			try {
				if(conn != null) 
					conn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
			try {
				if(pstmt != null)
					pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}	
	}
}
