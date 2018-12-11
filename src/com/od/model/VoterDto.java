package com.od.model;


import java.util.Date;

public class VoterDto 
{
	private String username;
	private Date dob;
	private String email;
	private long mnumber;
	private String address;
	private long Aadhar;
	private String gender;
	private String marital;
	private String education;
	private String image;
	private String password;
	private String userid;
	private int wardno;
	
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public long getMnumber() {
		return mnumber;
	}
	public void setMnumber(long mnumber) {
		this.mnumber = mnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadhar() {
		return Aadhar;
	}
	public void setAadhar(long aadhar) {
		Aadhar = aadhar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "VoterDto [username=" + username + ", dob=" + dob + ", email=" + email + ", mnumber=" + mnumber
				+ ", address=" + address + ", Aadhar=" + Aadhar + ", gender=" + gender + ", marital=" + marital
				+ ", education=" + education + ", image=" + image + ", password=" + password + ", userid=" + userid
				+ ", wardno=" + wardno + "]";
	}
	
		
	
}
