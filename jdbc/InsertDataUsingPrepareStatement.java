package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataUsingPrepareStatement {

	public static void main(String[] args) {
		try {
			
			//step 1-Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2-Establish Connection
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			
			//step 3 - Prepare stat
			PreparedStatement preparedStatement= connection.prepareStatement("insert into user(lastName,firstName,address,city,salary)values(?,?,?,?,?)");
			
			preparedStatement.setString(1, "pawar");
			preparedStatement.setString(2, "Asha");
			preparedStatement.setString(3, "muk");
			preparedStatement.setString(4, "Pune");
			preparedStatement.setString(5, "50000");
			
			//step 4
			
			int i=preparedStatement.executeUpdate();
			System.out.println("data inserted");


		connection.close();
		preparedStatement.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
