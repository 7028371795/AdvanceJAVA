package com.dynamicData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInformation {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 
		 //lastName,firstName,address,city,salary
		 System.out.println("Enter the last name>>");
		 String emplastName=scanner.next();
		 System.out.println("Enter the first name>>");
		 String empfirstName=scanner.next();
		 System.out.println("Enter the address>>");
		 String empaddress=scanner.next();
		 System.out.println("Enter the city >>");
		 String empcity=scanner.next();
		 System.out.println("Enter the salary>>");
		 String empsalary=scanner.next();
		 
		 UserInformation userInformation=new UserInformation();
		 userInformation.insertStudentData(emplastName,empfirstName,empaddress,empcity,empsalary);
	}

	private void insertStudentData(String lastName, String firstName, String address, String city, String salary) {
		
		try {
			ConnectionExample connectionExample=new ConnectionExample();
			Connection con=connectionExample.getConnectionDetails();
			
			PreparedStatement pre=con.prepareStatement("insert into user(lastName,firstName,address,city,salary)values(?,?,?,?,?)");
			pre.setString(1, lastName);
			pre.setString(2, firstName);
			pre.setString(3, address);
			pre.setString(4, city);
			pre.setString(5, salary);
			
			int i=pre.executeUpdate();
			System.out.println("data inserted...."+1);
			pre.close();
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
