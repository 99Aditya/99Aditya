package com.od.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.VoterDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;


@WebServlet("/notifyvoter")
public class NotifyVoterController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		VoterService vot=new VoterServiceImpl();
		List<VoterDto> vo=vot.gettoverifyvoter();
		if(vo!=null)
		{
			req.setAttribute("data", vo);
			RequestDispatcher rd1=req.getRequestDispatcher("Notifcationtoverifyvoterreq.jsp");
		    rd1.forward(req, resp);		}
	}
}
