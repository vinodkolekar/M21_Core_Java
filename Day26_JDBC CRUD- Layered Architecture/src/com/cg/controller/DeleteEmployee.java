package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			//to delete rows
			String query="DELETE FROM EMPLOYEE WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1,122);
			int r=p.executeUpdate();   
			if(r>0)
			{
				System.out.println("Existing user is deleted successfully");
			}
			c.close();   			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
