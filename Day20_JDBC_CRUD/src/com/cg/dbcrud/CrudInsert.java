package com.cg.dbcrud;
import java.sql.*;

public class CrudInsert {
	public static void main(String[] args) throws SQLException
	{
//		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="Vinod.vk.18";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query="INSERT INTO EMPLOYEE(ID,NAME, EMAIL_ID,PASSWORD) VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 70);
			p.setString(2, "Vinod");
			p.setString(3, "vinodkolekar123456@gmail.com");
			p.setString(4, "Vinod@12345");
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
