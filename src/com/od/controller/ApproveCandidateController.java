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
@WebServlet("/accept")
public class ApproveCandidateController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String s1=req.getParameter("userid");
		
		CandidateService csi=new CandidateServiceImpl();
		CandidateDto uname=csi.getcandidatedetail(s1);
		String toEmail=uname.getEmail();
		String s2=uname.getUsername();
		String pass=String.copyValueOf(UserPassword.password(8));
		int ul=csi.apprvovecandidate(s1,pass);
		String subject="Regarding your Application for Election Candidate";
		String message="Dear '"+s2+"',\n"
				+ "We have received your request for election.As you have mentioned details that we have been verified "
				+ "and your request has accepted for Election has been accepted. Yout login Id is '"+s1+"' and your password "
				+ "is '"+pass+"'.Please fill your remaining information.For any further query contact us at 0731 230509.";
		if(ul!=0)
		{
			TLSEmail.mailer(toEmail, subject, message);
			System.out.println("Request Aceepted");
		}
	}
}
