package com.tka.Jan15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UpdateOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3307/myntradb";
			String username="root";
			String password="2004";
			String updateQuery="update myntradb.player set P_runs=? where P_name=?";
			
			Class.forName(driver);
			System.out.println("Driver loadeed successfully");
			
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection build successfully");
			
			PreparedStatement pst=con.prepareStatement(updateQuery);
			System.out.println("Prepared statement object create successfully");
			
			pst.setInt(1, 199);
			pst.setString(2	, "Sanket");
			
			
			int ack=pst.executeUpdate();
			if(ack>0) {
				System.out.println("Update successfully");
			}else {
				System.out.println("Update failed");
			}
			
			pst.close();
			con.close();
			
	}

}
