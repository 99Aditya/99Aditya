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
@WebServlet("/candidatelogin")
public class candidatelogincontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1 = req.getParameter("userid");
		
		String s3 = req.getParameter("password");
		
		HttpSession session = req.getSession();
		
		
		CandidateService service=new CandidateServiceImpl();
		CandidateDto dto=service.getauthnticate(s1,s3);
		System.out.println("hii"+dto.getWardno());
		if (s1.equals(dto.getUserid()) && s3.equals(dto.getPassword())) {
			session.setAttribute("WardNo", dto.getWardno());
			session.setAttribute("userid", s1);
			session.setAttribute("password", s3);
			session.setAttribute("username", dto.getUsername());
			RequestDispatcher rd = req.getRequestDispatcher("chome.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("candidatelogin.jsp");
			rd.forward(req, resp);
			System.out.println("Sorry!Entered wrong id password.Try again");
		}
	}
}
