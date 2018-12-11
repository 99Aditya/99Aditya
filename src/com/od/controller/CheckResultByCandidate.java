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
import com.od.model.VotingDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
@WebServlet("/candidateresult")
public class CheckResultByCandidate extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String s1=(String) session.getAttribute("username");
		/*String s2=req.getParameter("electionid");*/
		System.out.println("controller user name"+s1);
		CandidateService service=new CandidateServiceImpl();
		List<VotingDto> list=service.getelectionresultbyid(s1);
		System.out.println("controller list"+list.size());
		
		if(list!=null)
		{
			req.setAttribute("det", list);
			RequestDispatcher rd = req.getRequestDispatcher("candidateelectionresult.jsp");
			rd.forward(req, resp);
		}
		else
		{
			
			RequestDispatcher rd = req.getRequestDispatcher("candidateelectionresult.jsp");
			rd.forward(req, resp);
		}
	}
}
