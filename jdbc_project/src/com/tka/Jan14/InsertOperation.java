package com.tka.Jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class InsertOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/myntradb";
		String username="root";
		String password="2004";
		String insertQuery="INSERT INTO myntradb.employee VALUES(?,?,?,?,?,?)";
		
		Class.forName(driver);
		System.out.println("Driver Loaded successfully");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Establish successfully");
		 
		PreparedStatement pst = conn.prepareStatement(insertQuery);
		System.out.println("Prepared Statement object create successfully");
		
			pst.setInt(1,12);
			pst.setString(2, "Raju");
			pst.setInt(3, 25);
			pst.setString(4, "Tester");
			pst.setInt(5, 19999);
			pst.setString(6,"2025-01-12");
			
		
		int ack = pst.executeUpdate();
		System.out.println("Query Executed successfully ");
		
		System.out.println("Number of rows inserted "+ack);
		if(ack>0) {
			System.out.println("Data inserted succesully");
		}else {
			System.out.println("Insert failed");
		}
		
	
		
	
		pst.close();
		conn.close();
		
		
	}

}
