package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//load the driver
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver loaded......");
			
			//get the db connection
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter the user and password:");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl , user , password);
			System.out.println("connection established........");
			
			//issue the sql queries
			String query="insert into users_info values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter Userid......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Username......");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter email....");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter Password....");
			pstmt.setString(4, sc.nextLine());
			
			//process the results
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("User Inserted......");
			}else {
				System.err.println("Something went wrong.......");
			}
		} catch (SQLException e) {
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
