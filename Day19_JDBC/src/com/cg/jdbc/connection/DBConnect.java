package com.cg.jdbc.connection;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;


public class DBConnect {

	public static void main(String[] args) throws SQLException
	{ 
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with mysql server
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUserName="root";
		String dbPassword="sanidamenu";
		String query="SELECT * FROM STUDENTS";
		//if any exception will occur in driver class that will handle by using catch block
		//if class name of the driver is incorrect, then it will throw an exception
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUserName, dbPassword);  //establish the connection between mysql and eclipse
			//driver manager will load the driver
			Statement s=c.createStatement();     // it will execute all sql query
			ResultSet r=s.executeQuery(query);
			
			while(r.next())
			{
				String data="";
				for(int i=1;i<=2;i++)
				{
					data=data+" "+r.getString(i);
				}
				System.out.println(data);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/ID/Password");
			e.printStackTrace();
		}
	}

}
