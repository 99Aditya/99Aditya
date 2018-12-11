package com.od.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.od.DaoImpl.UserId;
import com.od.model.VoterDto;
import com.od.service.VoterService;
import com.od.serviceimpl.VoterServiceImpl;
import com.od.utill.DateUtill;
import com.od.utill.EmailUtill;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

@WebServlet("/Votefor")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 10241024 * 50)
public class VoterRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String host;
	private String port;
	private String user;
	private String pass;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String s1 = req.getParameter("username");
		String s2 = req.getParameter("dob");
		Date date = DateUtill.ConvertStringtoDate(s2);
		String s3 = req.getParameter("email");
		String s4 = req.getParameter("mnumber");
		String s5 = req.getParameter("Address");
		String s6 = req.getParameter("Aadhar");
		String s7 = req.getParameter("Education");
		String s8 = req.getParameter("Gender");
		String s9 = req.getParameter("Marital");
		Part s10 = req.getPart("image");
		String filename=extractfilename(s10);
		String savepath = "D:\\I-Vote_System\\WebContent\\images" + File.separator +filename;
		File filesavedir = new File(savepath);
		s10.write(filesavedir + File.separator);
		InputStream mg = s10.getInputStream();
		int s13 = UserId.generateuserid("SELECT MAX(UserId) AS LastUserId FROM voterdetail");
		String id = "DOVOTE" + (s13 + 1);
		String s14=req.getParameter("wardno");
		Integer i= Integer.parseInt(s14);
		VoterDto vote = new VoterDto();
		
		
		vote.setUsername(s1);
		vote.setDob(date);
		vote.setEmail(s3);
		vote.setMnumber(Long.parseLong(s4));
		vote.setAddress(s5);
		vote.setAadhar(Long.parseLong(s6));
		vote.setEducation(s7);
		vote.setGender(s8);
		vote.setMarital(s9);
		vote.setImage(savepath);
		String pass = String.copyValueOf(UserPassword.password(8));
		System.out.println(pass);
		vote.setPassword(pass);
		vote.setUserid(id);
		vote.setWardno(i);
		VoterService vds = new VoterServiceImpl();
		int raw = vds.VoterReg(vote);
		String subject = "Online Voting Registration";
		String message = "Dear '" + s1 + "',\n"
				+ "Thank you for registering on online voting portal.We have registered your details and now will be eligible to vote using "
				+ "our portal.For login please goto login page and login to your using USER Id: '" + id
				+ "' and PASSWORD: '" + pass + "'.After login you can update your "
				+ "password any time.For any further query please contact 0731-230509.";
		host = "smtp.gmail.com";
        port = "465";
        user ="gangradeaditya01@gmail.com";
        pass = "74151019";
        
		System.out.println(message);
		if (raw > 0) {
			try {
				EmailUtill.sendEmail(host, port, user, pass, s3, subject,message);
				
				System.out.println("Data Inserted Successfully");
				RequestDispatcher rd = req.getRequestDispatcher("voterlogin.jsp");
				rd.forward(req, resp);
			} catch (MessagingException | javax.mail.MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			System.out.println("Data Inserted Successfully");
		} else {
			System.out.println("Data Not Inserted");
		}
	}
	private String extractfilename(Part part)
	{
		String contentDisp=part.getHeader("content-disposition");
		String[] items=contentDisp.split(";");
		for(String s: items)
		{
			if(s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=")+2, s.length()-1);
			}
		}
		return "";
		
	}
}

