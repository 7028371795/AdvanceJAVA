package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpDateRecordUsingPrepareSat {

	public static void main(String[] args) {
		try {

			// step 1-Load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// step 2-Establish Connection

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root",
					"root");

			// step 3 - Prepare stat
			PreparedStatement preparedStatement = connection
					.prepareStatement("update user set firstName=?,lastName=? where id=?");
			preparedStatement.setString(1, "Vrushali");
			preparedStatement.setString(2, "Patil");
			preparedStatement.setString(3,"7");
			
			//step 4 
			int i=preparedStatement.executeUpdate();
			System.out.println("Record is update");
			
			//step 5 
			
			connection.close();
			preparedStatement.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
