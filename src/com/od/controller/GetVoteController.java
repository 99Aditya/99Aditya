package com.od.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.od.model.VotingDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;

@WebServlet("/getvotingfromvoter")
public class GetVoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try{
		HttpSession session = req.getSession();
		/*String eid = (String) session.getAttribute("electionid12");
		System.out.println("Getting election id");
		System.out.println(eid);*/
		
		/*Timestamp timestamp = new Timestamp(new Date().getTime());*/

		String s1 = req.getParameter("candidatename");
		String s2 = (String) session.getAttribute("voterid");

		VotingDto dto = new VotingDto();
		dto.setCandidatename(s1);
		dto.setVoterid(s2);
		/*dto.setCurrentdatetime(timestamp);*/
		/*dto.setElectionid(Integer.parseInt(eid));*/
		VoterService vservice = new VoterServiceImpl();
		int row = vservice.getvoterfromvoter(dto);

		if (row != 0) {
			resp.sendRedirect("candidatevote.jsp");
			
		} else {
			System.out.println("Sorry! Please try again");
		}
	}
catch(Exception e)
{
	RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
	rd.forward(req, resp);
	


}
}


}
