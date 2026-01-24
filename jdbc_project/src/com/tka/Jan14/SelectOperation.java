package com.tka.Jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/myntradb";
		String username="root";
		String password="2004";
		String selectQuery="SELECT * FROM myntradb.employee";
		
		Class.forName(driver);
		System.out.println("Driver Loaded successfully");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Establish successfully");
		 
		Statement st = conn.createStatement();
		System.out.println("Statement object create successfully");
		
		ResultSet rs = st.executeQuery(selectQuery);
		System.out.println("Query Executed successfully ");
		
		System.out.println("\n"+"ID"+" "+"Name"+" "+"Age"+" "+"Dept"+" "+"Sal"+" "+"Date"+"\n");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age=rs.getInt(3);
			String dept=rs.getString(4);
			int sal=rs.getInt(5);
			String date=rs.getString(6);
			
			System.out.println(id+" "+name+" "+age+" "+dept+" "+sal+" "+date);
			
		}
		
		rs.close();
		st.close();
		conn.close();
	}

}
