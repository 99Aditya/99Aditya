package com.od.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.CandidateDto;
import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;
@WebServlet("/electionresult")
public class CountResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("Electionid");
		
		AdminService service=new AdminServiceImpl();
		List<CandidateDto> list=service.getelectionresult(s1);
		if(list!=null)
		{
			req.setAttribute("det", list);
			RequestDispatcher rd = req.getRequestDispatcher("showelectionresult.jsp");
			rd.forward(req, resp);
			
		}
	}

}
