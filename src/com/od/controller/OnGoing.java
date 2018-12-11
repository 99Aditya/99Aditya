package com.od.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.AddElectionDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;


@WebServlet("/ongoingelect")
public class OnGoing extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		VoterService vote=new VoterServiceImpl();
		List<AddElectionDto> dto=vote.getelectionname();
		
		
		if(dto!=null)
		{
			
			req.setAttribute("det", dto);
			RequestDispatcher rd=req.getRequestDispatcher("showongoingelection.jsp");
			rd.forward(req, resp);
			
		}
		}
		}
		
	

