package com.od.Dao;

import java.util.List;

import com.od.model.AddAdminDto;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VotingDto;

public interface AdminDao {
	public int doAdd(AddAdminDto admin);

	public int addelection(AddElectionDto addto);

	public List<AddElectionDto> getelectiondetail();

	public int startelection(String s1);

	public int stopelection(String s1);

	public List<CandidateDto> getelectionresult(String s1);

	public List<VotingDto> getelectiondetailsforresult();

	public AddAdminDto getauthnticate(String s1, String s2);
	
	public int updatepassword(String s1,String s2);
}
