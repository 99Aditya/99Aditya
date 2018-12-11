package com.od.controller;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.od.model.AddAdminDto;
import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;
import com.od.utill.DateUtill;

@MultipartConfig(maxFileSize=1000000000)
@WebServlet("/addadmin")
public class AddAdminController extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String s1=req.getParameter("username");
		String s2=req.getParameter("dob");
		Date date=(Date) DateUtill.ConvertStringtoDate(s2);
		String s3=req.getParameter("email");
		String s4=req.getParameter("mnumber");
		String s5=req.getParameter("userid");
		String s6=req.getParameter("pass");
		String s7=req.getParameter("designation");
		Part s8=req.getPart("pic");
		InputStream ipic=null;
		if(s8!=null)
		{
			System.out.println(s8.getName());
			System.out.println(s8.getSize());
			System.out.println(s8.getContentType());
			ipic=(s8).getInputStream();
		}
		AddAdminDto admin=new AddAdminDto();
		admin.setUname(s1);
		admin.setDob(date);
		admin.setEmail(s3);
		admin.setCnum(Long.parseLong(s4));
		admin.setUserid(s5);
		admin.setPassword(s6);
		admin.setDesignation(s7);
		admin.setImage(ipic);
		
		AdminService ads=new AdminServiceImpl();
		int row=ads.addadmin(admin);
		if(row>0)
		{
			System.out.println("Data Inserted Successfully");
			RequestDispatcher am=req.getRequestDispatcher("adminlogin.jsp");
			am.forward(req, resp);
		}
		else 
		{
			System.out.println("Data Not inserted successfully");
		}
	}
}
