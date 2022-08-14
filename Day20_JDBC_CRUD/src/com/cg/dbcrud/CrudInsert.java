package com.cg.dbcrud;
import java.sql.*;

public class CrudInsert {
	public static void main(String[] args) throws SQLException
	{
//		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query="INSERT INTO EMPLOYEE(ID,NAME, EMAIL_ID,PASSWORD) VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 70);
			p.setString(2, "Ravi");
			p.setString(3, "ravi14@gmail.com");
			p.setString(4, "Ravi@14");
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
