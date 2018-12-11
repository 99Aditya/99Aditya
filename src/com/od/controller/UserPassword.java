package com.od.controller;

import java.util.Random;

public class UserPassword {
	static char[] password(int len)
	{
		System.out.println("Your Password for the login is:- ");
		String Capital_char="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_letter="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		 String symbols = "!@#$%^&*_=+-/.?<>)";
		 
		 String values=Capital_char+Small_letter+numbers+symbols;
		 Random randon=new Random();
		 char[] password=new char[len];
		 for(int i=0;i<len;i++) 
		 {
			 password[i] =
		              values.charAt(randon
		            		  .nextInt(values.length()));
		 
		 }
		return password;
	}
	public static void main(String[] args) {
		int length=10;
		System.out.println(password(length));
	}
}
