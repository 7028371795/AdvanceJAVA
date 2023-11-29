package com.dynamicData;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
	
	public Connection getConnectionDetails() {
		Connection con=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "root");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return con;
		
	}

}
