package com.od.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.VoterDto;
import com.od.utill.JdbcConnection;

@WebServlet("/VoterDetail5")
public class VoterDetailGet extends HttpServlet
{
	Connection con = JdbcConnection.getConnection();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("first");
		PrintWriter out = resp.getWriter();
		System.out.println("Hello to acccept request ");
		
		String s1= req.getParameter("userid");
		System.out.println(s1);
		HttpSession ses = req.getSession();
		ses.setAttribute("userid",s1);
		try {
			System.out.println("try");
			PreparedStatement ps = con.prepareStatement("Select * from voterdetail where userid='"+s1+"'");

			ResultSet rs = ps.executeQuery();
			VoterDto vote = new VoterDto();
			
			while (rs.next()) {
				System.out.println("while");
				
				vote.setUsername(rs.getString("UserName"));
				vote.setDob(rs.getDate("Date_of_Birth"));
				vote.setEmail(rs.getString("Email_Id"));
				vote.setMnumber(rs.getLong("Mobile_Number"));
				vote.setAddress(rs.getString("Address"));
				vote.setAadhar(rs.getLong("Aadhar_Card_Number"));
				vote.setGender(rs.getString("Gender"));
				vote.setMarital(rs.getString("Marital_Status"));
				vote.setEducation(rs.getString("Education"));
				vote.setPassword(rs.getString("Password"));
				vote.setUserid(rs.getString("UserID"));
				vote.setImage(rs.getString("Image"));
			}
			if (vote!=null){
				req.setAttribute("det", vote);
				RequestDispatcher rd=req.getRequestDispatcher("VoterUpdate.jsp");
				rd.forward(req, resp);
				out.println(vote.getUserid());
			}
			else{
			out.print("There is something Wrong");
			}
		}	

			catch (SQLException e) {

				e.printStackTrace();
				
			}

	}
	}

