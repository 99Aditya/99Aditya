package com.od.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
@WebServlet("/reject")
public class RejectCandidateController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String s1=req.getParameter("userid");
		CandidateService csi=new CandidateServiceImpl();
		CandidateDto uname=csi.getcandidatedetail(s1);
		String s2=uname.getUsername();
		String toEmail=uname.getEmail();
		int rs=csi.rejectcandidate(s1);
		String subject="Regaring your application for electing election";
		String message="Dear '"+s2+"',\n"
				+ "As you have apply for electing election so we verifed your details provided by you and it is not as expected so sorry"
				+ " to informed that you are not eligible for electing election.\n"
				+ "Best wishes for your better success.";
		if(rs!=0)
		{
			TLSEmail.mailer(toEmail, subject, message);
			System.out.println("Request Rejected");
		}
	}

}
