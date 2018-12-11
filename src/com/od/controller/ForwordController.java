package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/forwordreg")
public class ForwordController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("electionid");
		HttpSession session=req.getSession();
		session.setAttribute("eid", s1);
		RequestDispatcher rd=req.getRequestDispatcher("CandidateReg.jsp");
		rd.forward(req, resp);
	}
}
