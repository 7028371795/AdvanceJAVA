package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertOpration {

	public static void main(String[] args) {
			
		try {
		String sql="insert into user(lastName,firstName,address,city,salary)values('chaudhari','chirau','muk','Muktainagar','120000')";
			
		//step 1-Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2-Establish Connection
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
		
		//step 3 - create statement
		
		Statement statement= connection.createStatement();
		
		//step 4 - Prepared statement or statement
		
		statement.execute(sql);
		
		//step 5- submit to sql statement
		System.out.println("Data inserted");
		
		connection.close();
		statement.close();
		
		
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
