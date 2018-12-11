package com.od.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;
@WebServlet("/acceptvot")
public class ApproveVoterController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Hello to acccept request ");
		String s1=req.getParameter("userid");
		VoterService vto=new VoterServiceImpl();
		int i=vto.approvevoter(s1);
		
		if(i!=0)
		{
			System.out.println("Request Accepted");
		}
	}
}
