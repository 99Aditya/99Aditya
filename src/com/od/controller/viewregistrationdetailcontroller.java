package com.od.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.AddElectionDto;
import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;

@WebServlet("/viewregistrationdetail")
public class viewregistrationdetailcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		AdminService service = new AdminServiceImpl();
		List<AddElectionDto> list = service.getelectiondetails();

		if (list != null) {

			req.setAttribute("data", list);
			RequestDispatcher rd = req.getRequestDispatcher("viewregistrationdetail.jsp");
			rd.forward(req, resp);
		}
	}
}
