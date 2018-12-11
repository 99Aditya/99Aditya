package com.od.model;

import java.util.Date;

public class AddElectionDto 
{
	private String position;
	private String qualification;
	private Date dateofelection;
	private Date dateofresult;
	private int nuapplication;
	private int tid;
	private Date registrationstartdate;
	private Date registrationstopdate;
	
	
	public Date getRegistrationstartdate() {
		return registrationstartdate;
	}
	public void setRegistrationstartdate(Date registrationstartdate) {
		this.registrationstartdate = registrationstartdate;
	}
	public Date getRegistrationstopdate() {
		return registrationstopdate;
	}
	public void setRegistrationstopdate(Date registrationstopdate) {
		this.registrationstopdate = registrationstopdate;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getNuapplication() {
		return nuapplication;
	}
	public void setNuapplication(int nuapplication) {
		this.nuapplication = nuapplication;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Date getDateofelection() {
		return dateofelection;
	}
	public void setDateofelection(Date dateofelection) {
		this.dateofelection = dateofelection;
	}
	public Date getDateofresult() {
		return dateofresult;
	}
	public void setDateofresult(Date dateofresult) {
		this.dateofresult = dateofresult;
	}
	@Override
	public String toString() {
		return "AddElectionDto [position=" + position + ", qualification=" + qualification + ", dateofelection="
				+ dateofelection + ", dateofresult=" + dateofresult + "]";
	}
	
}
