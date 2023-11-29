package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteUsingPreparedStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "root");

			PreparedStatement pre = con.prepareStatement("Delete from user where id=?");

			pre.setInt(1, 8);

			int i = pre.executeUpdate();
			System.out.println("Record deleted"+i);

			pre.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
