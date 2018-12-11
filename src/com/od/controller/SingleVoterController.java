package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.VoterDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;
@WebServlet("/approvevote")
public class SingleVoterController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

		String s1=req.getParameter("userid");
		VoterService vot=new VoterServiceImpl();
		VoterDto vto=vot.getsinglevoter(s1);
		if(vto!=null)
		{
			req.setAttribute("det", vto);
			RequestDispatcher rd=req.getRequestDispatcher("singlevoterdetails.jsp");
			rd.forward(req, resp);
		}
	}
}
