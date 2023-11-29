package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "root");
		
		PreparedStatement pre=con.prepareStatement("Select * from user");
		
		//this is appplicable for select query only
		
		ResultSet rs=pre.executeQuery();
		
		while(rs.next()) {
			System.out.println("ID>>"+rs.getInt(1));
			System.out.println("LastName>>"+rs.getString(2));
			System.out.println("FirstName>>"+rs.getString(3));
			System.out.println("Address>>"+rs.getString(4));
			System.out.println("city>>"+rs.getString(5));
			System.out.println("slary>>"+rs.getString(6));


		}
		pre=con.prepareStatement("Select id,firstName,lastName from user where id=?");
		
		pre.setInt(1, 1);
		
		rs=pre.executeQuery();
		while(rs.next()) {
			System.out.println("ID>>"+rs.getInt(1));
			System.out.println("LastName>>"+rs.getString(2));
			System.out.println("FirstName>>"+rs.getString(3));
		}
			
		con.close();
		pre.close();
		rs.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
