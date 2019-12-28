package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");

			//get db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter user and password");
			conn = DriverManager.getConnection(dbUrl,sc.nextLine(),sc.nextLine());
			System.out.println("Connection established");

			//issue the sql query via connection
			String query="update users_info set email=? "
					+ "where userid=? and password =?";
			pstmt = conn.prepareStatement(query);

			System.out.println("Enter Userid....");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter new Email...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter password to update");
			pstmt.setString(3, sc.nextLine());

			int count = pstmt.executeUpdate();
			System.out.println("Query Issued.....");

			//process the reults returned by query
			if(count > 0) {
				System.out.println("Query ok, "+count+" rows effected..");
			}else {
				System.out.println("Something went wrong....");
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//close all jdbc objects
		finally{
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
