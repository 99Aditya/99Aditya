package com.od.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;

@MultipartConfig(maxFileSize = 1000000000)
@WebServlet("/viewallcandidate")
public class ViewAllCandidateController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setContentType("image/png");
		CandidateService csd = new CandidateServiceImpl();
		List<CandidateDto> list = csd.viewallcandidatedetail();
		if (list != null) {
			req.setAttribute("data", list);

			RequestDispatcher rd = req.getRequestDispatcher("viewcandidatedetail.jsp");
			rd.forward(req, resp);
		}
	}
}
