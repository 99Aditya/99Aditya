package com.od.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.AddAdminDto;
import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;

@WebServlet("/adminlogin")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		
		String s1 = req.getParameter("userid");
		String s2 = req.getParameter("password");
		session.setAttribute("userid", s1);
		session.setAttribute("pass", s2);
		
		AdminService service = new AdminServiceImpl();
		AddAdminDto dto = service.getauthnticate(s1, s2);

		if (s1.equals(dto.getUserid()) && s2.equals(dto.getPassword())) {

			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("adminlogin.jsp");
			rd.forward(req, resp);
			System.out.println("Sorry!Entered wrong id password.Try again");
		}
	}

}
