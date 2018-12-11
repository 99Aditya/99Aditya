package com.od.utill;

import java.util.Date;
import java.util.Properties;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleEmail {
public static void main(String[] args) {
		
		// change accordingly
		final String username = "gangradeaditya01@gmail.com"; 
		
		// change accordingly
		final String password = "74151019";
		
		// or IP address
		

		// Get system properties
		Properties props = new Properties();			 
		
		// enable authentication
		props.put("mail.smtp.auth", true);			 
		
		// enable STARTTLS
		props.put("mail.smtp.starttls.enable", "true"); 
		
		// Setup mail server
		props.put("mail.smtp.host", "smtp.gmail.com");	 
		
		// TLS Port
		props.put("mail.smtp.port", "587");			 

		// creating Session instance referenced to 
		// Authenticator object to pass in 
		// Session.getInstance argument
		Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
			
			//override the getPasswordAuthentication method
			protected PasswordAuthentication 
						getPasswordAuthentication() {
										
				return new PasswordAuthentication(username, 
												password);
			}
		});

		try {
			
			// compose the message
			// javax.mail.internet.MimeMessage class is 
			// mostly used for abstraction.
			Message message = new MimeMessage(session); 
			
			// header field of the header.
			message.setFrom(new InternetAddress("gangradeaditya01@gmail.com")); 
			
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("gangradeaditya01@gmail.com"));
			message.setSubject("Hiiiii");
			message.setSentDate(new Date());
			message.setText("Yo it has been s");

			Transport.send(message);		 //send Message

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
