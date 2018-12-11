package com.od.service;

import java.util.List;

import com.od.model.AddAdminDto;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VotingDto;

public interface AdminService {
	public int addadmin(AddAdminDto admin);

	public int addelection(AddElectionDto addto);

	public List<AddElectionDto> getelectiondetails();

	public int startelection(String s1);

	public int stopelection(String s1);

	public List<CandidateDto> getelectionresult(String s1);

	

	public AddAdminDto getauthnticate(String s1, String s2);

	public int updatepassword(String s1, String s2);

	List<VotingDto> getelectiondetailsforresult(String s1);
}
