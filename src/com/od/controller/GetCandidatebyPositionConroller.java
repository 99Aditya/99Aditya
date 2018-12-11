 package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
@WebServlet("/getbyposition")
public class GetCandidatebyPositionConroller extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String s1=req.getParameter("userid");
		
		CandidateService cand=new CandidateServiceImpl();
		CandidateDto dto=cand.getallcandidatebyposition(s1);
		System.out.println(dto);
		if(dto!=null)
		{
			req.setAttribute("det", dto);
			RequestDispatcher rd=req.getRequestDispatcher("getcandidatedetailbyposition.jsp");
			rd.forward(req, resp);
			
		}
	}
}
