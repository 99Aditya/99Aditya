package com.od.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.VoterDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;

@MultipartConfig(maxFileSize = 1000000000)
@WebServlet("/viewallvoter")
public class ViewAllVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setContentType("image/png");
		VoterService vote = new VoterServiceImpl();
		List<VoterDto> list = vote.getallvoterdetail();
		if (list != null) {
			req.setAttribute("vdata", list);

			RequestDispatcher rd = req.getRequestDispatcher("viewvoterdetail.jsp");
			rd.forward(req, resp);
		}
	}

}
