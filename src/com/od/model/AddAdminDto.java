package com.od.model;


import java.io.InputStream;
import java.io.Serializable;

import java.util.Date;

public class AddAdminDto implements Serializable
{
	private String uname;
	private Date dob;
	private String email;
	private long cnum;
	private String userid;
	private String password;
	private String designation;
    private InputStream image;
    
	
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream image) {
		this.image = image;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCnum() {
		return cnum;
	}
	public void setCnum(long cnum) {
		this.cnum = cnum;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "AddAdminDto [uname=" + uname + ", dob=" + dob + ", email=" + email + ", cnum=" + cnum + ", username="
				+ userid + ", password=" + password + ", designation=" + designation + "]";
	}
	

}
