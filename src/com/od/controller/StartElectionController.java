package com.od.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;

@WebServlet("/startelect")
public class StartElectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("position");
System.out.println(s1);
		AdminService admin = new AdminServiceImpl();
		int row = admin.startelection(s1);
		if (row != 0) {
			System.out.println("Election has been started");
		} else {
			System.out.println("Election has not been started");
		}
	}
}
