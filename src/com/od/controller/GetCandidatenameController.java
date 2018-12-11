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

@WebServlet("/getcandidatelist")
public class GetCandidatenameController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("Applied");
		
		HttpSession session = req.getSession();
		session.setAttribute("electionid12", s1);
		CandidateService cans = new CandidateServiceImpl();
		List<CandidateDto> dto = cans.getcandidatelist(s1);

		if (dto != null) {
			req.setAttribute("det", dto);
			RequestDispatcher rd = req.getRequestDispatcher("getcandidatelist.jsp");
			rd.forward(req, resp);
		} else {
			System.out.println("Sorry! No data to show");
		}
	}
}
