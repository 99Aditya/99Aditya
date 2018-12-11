package com.od.model;

import java.io.InputStream;
import java.util.Date;

public class CandidateDto {
	private String username;
	private Date dob;
	private String email;
	private long mnumber;
	private String address;
	private String voterid;
	private long aadhar;
	private String gender;
	private String marital;
	private String education;
	private String image;
	private int status;
	private String userid;
	private String position;
	private int electionid;
	private int numberofvote;
	private String password;
	private int wardno;
	
	
	public int getWardno() {
		return wardno;
	}

	public void setWardno(int i) {
		this.wardno = i;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumberofvote() {
		return numberofvote;
	}

	public void setNumberofvote(int numberofvote) {
		this.numberofvote = numberofvote;
	}

	public int getElectionid() {
		return electionid;
	}

	public void setElectionid(int electionid) {
		this.electionid = electionid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getUsername() {
		return username;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
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

	@Override
	public String toString() {
		return "CandidateDto [username=" + username + ", dob=" + dob + ", email=" + email + ", mnumber=" + mnumber
				+ ", address=" + address + ", voterid=" + voterid + ", aadhar=" + aadhar + ", gender=" + gender
				+ ", marital=" + marital + ", education=" + education + ", image=" + image + ", status=" + status
				+ ", userid=" + userid + ", position=" + position + ", electionid=" + electionid + ", numberofvote="
				+ numberofvote + ", password=" + password + ", wardno=" + wardno + "]";
	}

	
}
