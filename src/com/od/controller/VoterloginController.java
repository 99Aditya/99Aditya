package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.VoterDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;

@WebServlet("/voterlogin")
public class VoterloginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String s1 = req.getParameter("userid");
		String s2 = req.getParameter("password");

		VoterService vservice = new VoterServiceImpl();
		VoterDto dto = vservice.getauthntication(s1, s2);
		session.setAttribute("WardNo1", dto.getWardno());

		if (s1.equals(dto.getUserid()) && s2.equals(dto.getPassword())) {
			session.setAttribute("voterid", s1);
			session.setAttribute("pass", s2);
			RequestDispatcher rd = req.getRequestDispatcher("vhomescreen.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("voterlogin.jsp");
			rd.forward(req, resp);
			System.out.println("Sorry!Entered wrong id password.Try again");
		}
	}
}
