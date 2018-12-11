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
@WebServlet("/notification")
public class NotifyCandidateController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Hello Servlet to verfiy");

		resp.setContentType("text/html");
		resp.setContentType("image/png");
		CandidateService csd=new CandidateServiceImpl();
		List<CandidateDto> list1=csd.gettoverifycandidate();
		
		System.out.println("controller"+list1.size());
		if(list1!=null)
		{
			
			HttpSession hs=req.getSession();
			hs.setAttribute("userid", list1);
			req.setAttribute("data", list1);
			/*os.write(data.image);*/
			RequestDispatcher rd1=req.getRequestDispatcher("Notifcationtoverifyreq.jsp");
		    rd1.forward(req, resp);
		}
	}
}
