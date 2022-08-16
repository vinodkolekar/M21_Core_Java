package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) 
	{
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="Vinod.vk.18";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			//to update rows
			String query="UPDATE EMPLOYEE SET NAME=?,EMAIL_ID=?,PASSWORD=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setString(1, "Vinod");
			p.setString(2, "vinodkolekar12345@gmail.com");
			p.setString(3, "Vinokol23");
			p.setInt(4, 1);
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
