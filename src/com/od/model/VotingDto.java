package com.od.model;

import java.sql.Timestamp;

public class VotingDto 
{
	private String voterid;
	private String candidatename;
	private Timestamp currentdatetime;
	private int electionid;
	
	public int getElectionid() {
		return electionid;
	}
	public void setElectionid(int electionid) {
		this.electionid = electionid;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}
	
	
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public Timestamp getCurrentdatetime() {
		return currentdatetime;
	}
	public void setCurrentdatetime(Timestamp currentdatetime) {
		this.currentdatetime = currentdatetime;
	}
	@Override
	public String toString() {
		return "VotingDto [voterid=" + voterid + ", candidatename=" + candidatename + ", currentdatetime="
				+ currentdatetime + ", electionid=" + electionid + "]";
	}
	
	
}
