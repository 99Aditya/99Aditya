package com.od.utill;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {
public static Connection getConnection() 
	{
		Connection con=null;
		Properties p=new Properties();
		try 
		{
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/od/resource/Jdbc.properties"));
		String d=p.getProperty("Driver");
		String url=p.getProperty("url");
		String u=p.getProperty("username");
		String pas=p.getProperty("password");
		Class.forName(d);
		con=DriverManager.getConnection(url, u, pas);
		return con;
		}
		catch(IOException  e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		return con;
	}
}
