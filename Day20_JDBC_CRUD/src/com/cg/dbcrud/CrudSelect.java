package com.cg.dbcrud;
import java.sql.*;

public class CrudSelect 
{
	public static void main(String[] args) 
	{
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
			//int count=0;
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				String email=r.getString(3);
				String password=r.getString(4);
				
				String output="Emp. info: %d %s %s %s";
				System.out.println(String.format(output,id,name,email,password));
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		
	}
}
