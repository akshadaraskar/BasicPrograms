package com.jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("entering in try ");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnectivitydb", "root", "root");

			Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from student");
				while(rs.next())
				{
					System.out.println("entering in while loop");
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
					//rs.close();
					//conn.close();
				}
			
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}

	}

}
