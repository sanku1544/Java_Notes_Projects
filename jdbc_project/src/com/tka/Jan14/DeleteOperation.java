package com.tka.Jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class DeleteOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/myntradb";
		String username="root";
		String password="2004";
		String updateQuery="delete from myntradb.employee where E_id=?";
		
		Class.forName(driver);
		System.out.println("Driver Loaded successfully");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Establish successfully");
		 
		PreparedStatement pst = conn.prepareStatement(updateQuery);
		System.out.println("Prepared Statement object create successfully");
		
		pst.setInt(1,2);
			
		int ack = pst.executeUpdate();
		System.out.println("Query Executed successfully ");
		
		System.out.println("Number of rows inserted "+ack);
		if(ack>0) {
			System.out.println("Data Delete succesully");
		}else {
			System.out.println("Delete failed");
		}
		
	
		
	
		pst.close();
		conn.close();
		
		
	}

}
