package com.od.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.od.utill.JdbcConnection;

public class UserId 
{
	Connection con=JdbcConnection.getConnection();
	static String getvalue;
	static int n;
	public static int generateuserid(String passquery)
	{
		int s=0;
		try
		{
	
			Connection con=JdbcConnection.getConnection();
		    PreparedStatement ps=con.prepareStatement(passquery);
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()) 
	      	{
			     getvalue=rs.getString(1);
			    
		         s=splitString(getvalue);
		    }
		 return s;
		}
		catch(Exception e) 
		{
			System.out.println(e);
			return 0;
		}
    }
	 static int splitString(String userid)
	    {
		 	String numberOnly= userid.replaceAll("[^0-9]", "");
			n=Integer.parseInt(numberOnly);
			return n;
	    }
}
