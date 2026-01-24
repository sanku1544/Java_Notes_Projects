package com.tka.Jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectOperation {

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
		
		List<Employee> emp=new ArrayList<>();
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age=rs.getInt(3);
			String dept=rs.getString(4);
			int sal=rs.getInt(5);
			String date=rs.getString(6);
			
			Employee e1= new Employee(id,name,age,dept,sal,date);
			
			emp.add(e1);
			
			
			
//			System.out.println(id+" "+name+" "+age+" "+dept+" "+sal+" "+date);
			
		}
		for(Employee e:emp) {
			if(e.getE_name().startsWith("S")) {
				System.out.println(e);
			}
			
		}
		
		rs.close();
		st.close();
		conn.close();
		
		
	}

}
