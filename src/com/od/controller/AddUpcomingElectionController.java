package com.od.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.od.model.AddElectionDto;
import com.od.service.AdminService;
import com.od.serviceimpl.AdminServiceImpl;
import com.od.utill.DateUtill;
@WebServlet("/addelection")
public class AddUpcomingElectionController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String s1=req.getParameter("position");
		String s2=req.getParameter("qualification");
		String s3=req.getParameter("application");
		String s4=req.getParameter("dateofelect");
		Date date=DateUtill.ConvertStringtoDate(s4);
		String s5=req.getParameter("dateofresult");
		String s6=req.getParameter("Registrationstartdate");
		String s7=req.getParameter("Registrationstartdate");
		Date date1=DateUtill.ConvertStringtoDate(s5);
		Date date2=DateUtill.ConvertStringtoDate(s6);
		Date date3=DateUtill.ConvertStringtoDate(s7);
		
		AddElectionDto addto=new AddElectionDto();
		addto.setPosition(s1);
		addto.setQualification(s2);
		addto.setNuapplication(Integer.parseInt(s3));
		addto.setDateofelection(date);
		addto.setDateofresult(date1);
		addto.setRegistrationstartdate(date2);
		addto.setRegistrationstopdate(date3);
		AdminService addser=new AdminServiceImpl();
		int row=addser.addelection(addto);
		if(row>0)
		{
			System.out.println("Successfully inserted data");
			RequestDispatcher rd = req.getRequestDispatcher("adminhome.jsp");
			rd.forward(req, resp);
			
		}
		else 
		{
			System.out.println("Not inserted");
		}
	}
}
