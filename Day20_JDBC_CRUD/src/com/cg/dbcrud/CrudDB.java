package com.cg.dbcrud;
import java.sql.*;

public class CrudDB 
{
	public static void main(String[] args) throws SQLException
	{
		@SuppressWarnings("unused")
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="Vinod.vk.18";
		try
		{
			//to check whether the eclipse is connected with mysql or not
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword); 
			if(c!=null)
			{
				System.out.println("Connection Establised");
				c.close();   //whenever we open or established a connection we always have to close the connection
			}		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
	    }
	}
}
