package com.od.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.od.utill.DateUtill;
@WebServlet("/update")
public class Update extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ses= req.getSession();
		String userid = (String) ses.getAttribute("userid");
		String s1=req.getParameter("username");
		
		String s2=req.getParameter("email");
		String s3 = req.getParameter("mnumber");
		String s4 = req.getParameter("address");
		
		String s6 = req.getParameter("gender");
		String s7 = req.getParameter("marital");
		String s8 = req.getParameter("education");
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/i_vote_system", "root", "root");
			
			String query = "update voterdetail set UserName=? ,Email_Id=? ,Mobile_Number=? ,Address =? ,Gender =? ,Marital_Status =?,Education =? where UserID= ? ";
		PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			
			ps.setString(5, s6);
			ps.setString(6, s7);
			ps.setString(7, s8);
			ps.setString(8, userid);
			int i = ps.executeUpdate();
			
		
			
			if(i>0){
		  System.out.println("Update Successful");
		  RequestDispatcher rd = req.getRequestDispatcher("/VoterDetail5");
			rd.forward(req, resp);
			}
			else{
				System.out.println("Member not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private String extractfilename(Part ss) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
