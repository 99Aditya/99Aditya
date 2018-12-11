package com.od.controller;
import java.io.IOException;
import java.io.PrintWriter;
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
import com.od.service.VoterService;
import com.od.serviceimpl.CandidateServiceImpl;
import com.od.serviceimpl.VoterServiceImpl;

@WebServlet("/votingoption")
public class VotingOptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs = req.getSession();
		String s2 = (String) hs.getAttribute("voterid");
		String s1 = req.getParameter("tid");
		System.out.println("controller"+s1);
		
		HttpSession session=req.getSession();
		/*session.setAttribute("electionid12", s1);*/
		CandidateService cand = new CandidateServiceImpl();
		List<CandidateDto> can = cand.getcandidatelist(s1);

		VoterService vote = new VoterServiceImpl();
		boolean b = vote.getvotedvoterlist(s1, s2);
		System.out.println("voterid"+s2);
		System.out.println("tld"+s1);
System.out.println(can.size());
		if (b == true) {
			
			PrintWriter out = resp.getWriter();
			out.print("YOU HAVE ALREADY VOTED");
			RequestDispatcher rd = req.getRequestDispatcher("showongoingelection.jsp");
			rd.forward(req, resp);
			out.print("YOU HAVE ALREADY VOTED");
		} else {
			System.out.println("else"+can.size());
			if (can != null) {
				req.setAttribute("det", can);
				RequestDispatcher rd = req.getRequestDispatcher("selectyourcandidate.jsp");
				rd.include(req, resp);

			}
		}
	}
}
