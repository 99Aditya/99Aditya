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

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
@WebServlet("/getcandtocnd")
public class getspecificcandidatelist extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String s1=(String) session.getAttribute("userid");
		CandidateService cans = new CandidateServiceImpl();
		List<CandidateDto> dto = cans.getspecificcandidatelist(s1);

		if (dto != null) {
			req.setAttribute("data", dto);
			RequestDispatcher rd = req.getRequestDispatcher("getspecificcandidate.jsp");
			rd.forward(req, resp);
		} else {
			System.out.println("Sorry! No data to show");
		}
	}
}
