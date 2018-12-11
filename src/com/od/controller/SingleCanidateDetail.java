package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
@WebServlet("/approve")
public class SingleCanidateDetail extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		String s1=req.getParameter("userid");
		
		CandidateService csi=new CandidateServiceImpl();
		CandidateDto uname=csi.getcandidatedetail(s1);
		session.setAttribute("det",uname);
		
		RequestDispatcher rd=req.getRequestDispatcher("approverejeccandidate.jsp");
		rd.forward(req, resp);
	}
}
