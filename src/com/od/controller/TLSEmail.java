package com.od.controller;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import com.od.utill.EmailUtill;
public class TLSEmail 
{
	static String mailer(String toEmail,String subject, String message) 
	{
		final String fromemail="onlineelectionproject@gmail.com";
		final String password="s5f9n8j321";
		
		System.out.println("TLS EMAIL START");
		Properties props=new Properties();
		
		props.put("mail.smtp.auth", "true"); //enable authentication
		
		props.put("mail.smtp.starttls.enable","true"); //enable STARTTLS
		
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		
		props.put("mail.smtp.port","587"); //TLS Port
	
		//create Authenticator object to pass in Session.getInstance argument
		Session session=Session.getInstance(props, new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() 
			{
				return new PasswordAuthentication(fromemail,password);
			}
		});
		//Session session2=Session.getInstance(props, auth);
		//EmailUtill.sendEmail(host, port, userName, password, toAddress, subject, message);(session, toEmail,subject,message);
		return null;
		}
}
