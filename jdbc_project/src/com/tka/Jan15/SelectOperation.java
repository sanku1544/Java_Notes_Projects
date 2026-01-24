package com.tka.Jan15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SelectOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3307/myntradb";
			String username="root";
			String password="2004";
			String selectQuery="SELECT * FROM myntradb.player";
			
			Class.forName(driver);
			System.out.println("Driver loaded  successfully");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection successfully build");
			
			PreparedStatement pst= con.prepareStatement(selectQuery);
			System.out.println("Prepare object create successfully");
			
			ResultSet rs = pst.executeQuery();
			System.out.println("Query Executed successfully ");
			
			List<Player> lp=new ArrayList<>();
			
			while(rs.next()) {
				int jn=rs.getInt(1);
				String name=rs.getString(2);
				int runs=rs.getInt(3);
				int wk=rs.getInt(4);
				String tname=rs.getString(5);
				String cname=rs.getString(6);
				
				Player p1=new Player(jn,name,runs,wk,tname,cname);
				lp.add(p1);
				
			}
			for(Player p:lp) {
				
				System.out.println(p);
				
			}
			
			rs.close();
			pst.clearBatch();
			con.close();
			
	}

}
