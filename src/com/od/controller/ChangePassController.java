package com.od.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;

@WebServlet("/changgepass")
public class ChangePassController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String s1 = (String) session.getAttribute("voterid");
		String s3 = (String) session.getAttribute("pass");
		String s4 = req.getParameter("oldpassword");
		String s2 = req.getParameter("newpassword");
		String s5 = req.getParameter("confirmpass");
		if (s3.equals(s4) && s2.equals(s5)) {
			AdminService service = new AdminServiceImpl();
			int row = service.updatepassword(s1, s2);
			if (row != 0) {
				System.out.println("Password hasbeen Updated");
			} else {
				System.out.println("Not Updated");
			}
		} else {
			System.out.println("OldPassword is Wrong");
		}
	}
}
