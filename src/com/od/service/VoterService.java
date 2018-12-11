package com.od.service;

import java.sql.SQLException;
import java.util.List;

import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;

public interface VoterService {
	public int VoterReg(VoterDto vote);
	public List<VoterDto> getallvoterdetail();
	public List<VoterDto> gettoverifyvoter();
	public VoterDto getsinglevoter(String s1);
	public int approvevoter(String s1);
	public int rejectreqvoter(String s1);
	/*public List<AddElectionDto> getelectionname();*/
	public int getvoterfromvoter(VotingDto dto) throws SQLException;
	public VoterDto getauthntication(String s1,String s2);
	public boolean getvotedvoterlist(String s1,String s2);
	public List<CandidateDto> getcandidatedata(int s1);
	public List<AddElectionDto> getelectionname();
}
