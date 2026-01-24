package com.tka.Jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class UpdateOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/myntradb";
		String username="root";
		String password="2004";
		String updateQuery="update myntradb.employee set E_salary= ? where E_id= ? ";
		
		Class.forName(driver);
		System.out.println("Driver Loaded successfully");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Establish successfully");
		 
		PreparedStatement pst = conn.prepareStatement(updateQuery);
		System.out.println("Prepared Statement object create successfully");
		
			
			pst.setInt(1,19999);
			pst.setInt(2, 5);
		
			
		int ack = pst.executeUpdate();
		System.out.println("Query Executed successfully ");
		
		System.out.println("Number of rows inserted "+ack);
		if(ack>0) {
			System.out.println("Data Update succesully");
		}else {
			System.out.println("Update failed");
		}
		
	
		
	
		pst.close();
		conn.close();
		
		
	}

}
