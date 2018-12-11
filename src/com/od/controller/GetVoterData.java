package com.od.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
import com.od.utill.JdbcConnection;
@WebServlet("/voter")
public class GetVoterData extends HttpServlet
{
	Connection con = JdbcConnection.getConnection();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		resp.setContentType("text/html");
		System.out.println("first");
		PrintWriter out = resp.getWriter();
		System.out.println("Hello to acccept request ");
		
		int s1= (Integer) session.getAttribute("WardNo");
		System.out.println(s1);
		CandidateService csd = new CandidateServiceImpl();
		List<VoterDto> list = csd.getvoterdata(s1);
		System.out.println("done");
		System.out.println(list.size());
		if (list != null) {
			req.setAttribute("data", list);

			RequestDispatcher rd = req.getRequestDispatcher("getvoter.jsp");
			rd.forward(req, resp);
		}

	}

}
