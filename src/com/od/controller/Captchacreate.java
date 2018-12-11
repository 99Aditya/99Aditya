package com.od.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/captcha-image")
class Captcha extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("imgage/jpg");
		int iTotalChars=6;
		int iwidth = 150;
		int iheight = 40;
		
		Font fntstyle1=new Font("Arial", Font.BOLD, 30);
		Font fntstyle2=new Font("Verdana", Font.BOLD, 20);
		
		Random randChars=new Random();
		String sImagecode=(Long.toString(Math.abs(randChars.nextLong())).substring(0,iTotalChars));
		BufferedImage biImage=new BufferedImage(iwidth, iheight, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2dimg=(Graphics2D) biImage.getGraphics();
		
		int iCircle=15;
		for(int i=0;i<iCircle;i++) 
		{
			g2dimg.setColor(new Color(randChars.nextInt(255),randChars.nextInt(255),randChars.nextInt(255)));
			int iRadius=(int) (Math.random()*iheight/2.0);
			int iX=(int) (Math.random()*iwidth-iRadius);
			int iY=(int) (Math.random()*iheight-iRadius);
			
		}
		for(int i=0;i<iCircle;i++)
		{
			g2dimg.setColor(new Color(randChars.nextInt(255),randChars.nextInt(255) , randChars.nextInt(255)));
			if(i%2==0)
			{
				g2dimg.drawString(sImagecode.substring(i,i+1),  25*i,24);
			}
			g2dimg.drawString(sImagecode.substring(i,i+1),  25*i,34);
		}
	OutputStream osImage=response.getOutputStream();
	ImageIO.write(biImage, "jpeg", osImage);
	g2dimg.dispose();
	
	HttpSession session=request.getSession();
	session.setAttribute("captcha_security", sImagecode);
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	HttpSession session=req.getSession();
	String captcha=session.getAttribute("captcha_security").toString();
	String verifyCaptcha=req.getParameter("captcha");
	if(captcha.equals(verifyCaptcha))
	{
//		RequestDispatcher rd=req.getRequestDispatcher("adminreg.jsp");
//		rd.forward(req, resp);
		System.out.println("CAptcha are correct");
	}
	else {
		req.setAttribute("error", "captcha invalid");
		RequestDispatcher rd=req.getRequestDispatcher("adminreg.jsp");
		rd.forward(req, resp);
	}
	}
}
