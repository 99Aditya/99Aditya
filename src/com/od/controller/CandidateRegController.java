package com.od.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.od.model.CandidateDto;
import com.od.service.CandidateService;
import com.od.serviceimpl.CandidateServiceImpl;
import com.od.utill.DateUtill;
import com.od.utill.EmailUtill;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

@MultipartConfig(maxFileSize = 1000000000)
@WebServlet("/candidateReg")
public class CandidateRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String host;
	private String port;
	private String user;
	private String pass;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		/*String s=(String) session.getAttribute("eid");
		System.out.println(s);
		*/

		String s1 = req.getParameter("username");
		String s2 = req.getParameter("dob");
		Date date = DateUtill.ConvertStringtoDate(s2);
		String s3 = req.getParameter("email");
		String s4 = req.getParameter("mnumber");
		String s5 = req.getParameter("Address");
		String s6 = req.getParameter("voterid");
		String s7 = req.getParameter("Aadhar");
		String s8 = req.getParameter("Education");
		String s9 = req.getParameter("Gender");
		String s10 = req.getParameter("Marital");
		System.out.println("before img");
		Part s11 = req.getPart("image");
		String filename=extractfilename(s11);
		String savepath = "D:\\I-Vote_System\\WebContent\\images" + File.separator +filename;
		File filesavedir = new File(savepath);
		s11.write(savepath + File.separator);
		InputStream mg = s11.getInputStream();
		String s16=req.getParameter("wardno");
		Integer i=Integer.parseInt(s16);
		String s17=req.getParameter("position");
		System.out.println("before img2");
		

		CandidateDto cand = new CandidateDto();
		cand.setUsername(s1);
		cand.setDob(date);
		cand.setEmail(s3);
		cand.setMnumber(Long.parseLong(s4));
		cand.setAddress(s5);
		cand.setVoterid(s6);
		cand.setAadhar(Long.parseLong(s7));
		cand.setEducation(s8);
		cand.setGender(s9);
		cand.setMarital(s10);
		cand.setImage(savepath);
		String pass = String.copyValueOf(UserPassword.password(8));
		System.out.println(pass);
		cand.setPassword(pass);
		cand.setWardno(i);
		cand.setPosition(s17);
		/*cand.setUserid(id);*/
	//	cand.setElectionid(Integer.parseInt(s));
		CandidateService cds = new CandidateServiceImpl();
		int row = cds.CandidateReg(cand);
		String subject = "Regarding your Election Application";
		String message = "Dear '" + s1 + "',\n"
				+ "Thank you applying for electing election. As we have received your application so our officer will verify your details"
				+ "and as per his verfication your request will be accepted or rejected.We will reply for your application within next 24 hours.";
		host = "smtp.gmail.com";
        port = "465";
        user ="gangradeaditya01@gmail.com";
        pass = "74151019";

		
		if (row > 0) {
			try {
				EmailUtill.sendEmail(host, port, user, pass, s3, subject,message);
				
				System.out.println("Data Inserted Successfully");
				RequestDispatcher rd = req.getRequestDispatcher("candidatelogin.jsp");
				rd.forward(req, resp);
			} catch (MessagingException | javax.mail.MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			System.out.println("Data Inserted Successfully");

		} else {
			System.out.println("Data Not Inserted Successfully");
		}

	}

	private String extractfilename(Part s11) {
		// TODO Auto-generated method stub
		return null;
	}
}
