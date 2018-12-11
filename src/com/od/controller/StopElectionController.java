package com.od.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;
@WebServlet("/stopelection")
public class StopElectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("stopid");
		AdminService service=new AdminServiceImpl();
		int row = service.stopelection(s1);
		
		if(row!=0) 
		{
			System.out.println("Election has been stop");
			
		}
		else {
			System.out.println("Election not stoped");
		}
	}

}
