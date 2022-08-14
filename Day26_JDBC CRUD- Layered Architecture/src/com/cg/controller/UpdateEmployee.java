package com.cg.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query="UPDATE EMPLOYEE SET Salary=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setFloat(1, 32000f);
			p.setInt(2, 234);
			int r=p.executeUpdate();   
			if(r>0)
			{
				System.out.println("A new user is updated successfully");
			}
			c.close();   			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}
}