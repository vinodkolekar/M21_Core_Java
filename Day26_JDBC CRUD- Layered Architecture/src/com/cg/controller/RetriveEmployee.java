package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveEmployee {

	public static void main(String[] args) {

		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			//to retrieve a data
			String query="SELECT * FROM EMPLOYEE";
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery(query);
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				float salary=r.getFloat(3);
				
				String output="Emp. info: %d %s %f";
				System.out.println(String.format(output,id,name,salary));
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		
	}
}
