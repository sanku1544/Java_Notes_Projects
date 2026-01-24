package com.tka.Jan15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DeleteOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3307/myntradb";
			String username="root";
			String password="2004";
			String deleteQuery="delete from myntradb.player where P_jn=?";
			
			Class.forName(driver);
			System.out.println("Driver loadeed successfully");
			
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection build successfully");
			
			PreparedStatement pst=con.prepareStatement(deleteQuery);
			System.out.println("Prepared statement object create successfully");
			
			
			pst.setInt(1,44);
			
			
			int ack=pst.executeUpdate();
			if(ack>0) {
				System.out.println("Delete successfully");
			}else {
				System.out.println("Delete failed");
			}
			
			pst.close();
			con.close();
			
	}

}
