package com.od.service;

import java.util.List;

import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;

public interface CandidateService {
	public int CandidateReg(CandidateDto cand);

	public List<CandidateDto> gettoverifycandidate();

	public CandidateDto getcandidatedetail(String s1);

	public int apprvovecandidate(String s1, String pass);

	public int rejectcandidate(String s1);

	public List<CandidateDto> viewallcandidatedetail();

	public CandidateDto getallcandidatebyposition(String s1);

	public List<CandidateDto> getcandidatelist(String s1);

	public CandidateDto getauthnticate(String s1, String s3);

	public List<CandidateDto> getspecificcandidatelist(String s1);

	public List<VotingDto> getelectionresultbyid(String s1);

	public List<VoterDto> getvoterdata(int s1);
}
