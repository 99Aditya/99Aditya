package com.od.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.AddElectionDto;
import com.od.model.VotingDto;
import com.od.service.AdminService;
import com.od.service.CandidateService;
import com.od.serviceimpl.AdminServiceImpl;
import com.od.serviceimpl.CandidateServiceImpl;

@WebServlet("/electresu")
public class Electionresultcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		HttpSession session=req.getSession();
		String s1=(String) session.getAttribute("username");
		String s2=req.getParameter("electionid");

			AdminService service=new AdminServiceImpl();
		
		List<VotingDto> list = service.getelectiondetailsforresult(s1);
		System.out.println("controller list"+list.size());
		
		if(list!=null)
		{
			req.setAttribute("det", list);
			RequestDispatcher rd = req.getRequestDispatcher("electionresult.jsp");
			rd.forward(req, resp);
		}
		else
		{
			
			RequestDispatcher rd = req.getRequestDispatcher("electionresult.jsp");
			rd.forward(req, resp);
		}
	}
	
	}

