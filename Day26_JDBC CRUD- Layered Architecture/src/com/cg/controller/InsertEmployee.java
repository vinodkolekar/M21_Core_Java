package com.cg.controller;
import java.sql.*;

public class InsertEmployee
{

	public static void main(String[] args) 
	{
		//String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query="INSERT INTO EMPLOYEE(ID,NAME, Salary) VALUES(?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 122);
			p.setString(2, "Ashia");
			p.setInt(3, 36000);
			int r=p.executeUpdate();   //r is for row  // executes sql statements
			if(r>0)
			{
				System.out.println("A new user is inserted successfully");
			}
			c.close();   //to close the connection			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	

	}

}
