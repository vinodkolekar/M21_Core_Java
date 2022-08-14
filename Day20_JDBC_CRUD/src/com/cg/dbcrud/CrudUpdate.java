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
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			//to update rows
			String query="UPDATE EMPLOYEE SET NAME=?,EMAIL_ID=?,PASSWORD=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setString(1, "Sally");
			p.setString(2, "sally984@gmail.com");
			p.setString(3, "Sal$mo23");
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
