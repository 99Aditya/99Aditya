package com.od.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.od.Dao.CandidateDao;
import com.od.Dao.VoterDao;
import com.od.DaoImpl.CandidateDaoImpl;
import com.od.DaoImpl.VoterDaoImpl;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;
import com.od.service.VoterService;

public class VoterServiceImpl implements VoterService {

	@Override
	
	public int VoterReg(VoterDto vote) {
	if(vote!=null)
	{
		VoterDao vad=new VoterDaoImpl();
		int raw=vad.VoterReg(vote);
		return raw;
	}
		return 0;
	}

	@Override
	public List<VoterDto> getallvoterdetail() {
		VoterDao vot=new VoterDaoImpl();
		List<VoterDto> dat=vot.getallvoterdetail();
		return dat;
	}

	@Override
	public List<VoterDto> gettoverifyvoter() {
		VoterDao vot=new VoterDaoImpl();
		List<VoterDto> dam=vot.gettoverifyvoter();
		return dam;
	}

	@Override
	public VoterDto getsinglevoter(String s1)
	{
		VoterDao vto=new VoterDaoImpl();
		VoterDto dto=vto.getsinglevoterdetail(s1);
		return dto;
	}

	@Override
	public int approvevoter(String s1)
	{
		VoterDao vto=new VoterDaoImpl();
		int dto=vto.approvevoter(s1);
		return dto;
	}

	@Override
	public int rejectreqvoter(String s1) {
		VoterDao vto=new VoterDaoImpl();
		int dto=vto.rejectreqvoter(s1);
		return dto;
	}

	

	@Override
	public int getvoterfromvoter(VotingDto dto) throws SQLException {
		VoterDao dao=new VoterDaoImpl();
		int row=dao.getvoterfromvoter(dto);
		return row;
	}

	@Override
	public VoterDto getauthntication(String s1,String s2) {
		VoterDao dao=new VoterDaoImpl();
		VoterDto dto=dao.getauthntication(s1,s2);
		return dto;
	}

	@Override
	public boolean getvotedvoterlist(String s1,String s2) {
		VoterDao dao=new VoterDaoImpl();
		boolean list=dao.getvotedvoterlist(s1,s2);
		return list;
	}

	public List<CandidateDto> getcandidatedata(int s1)
	{
		VoterDao n=new VoterDaoImpl();
		List<CandidateDto> i=n.getcandidatedata(s1);
		return i;
		
	}

	@Override
	public List<AddElectionDto> getelectionname() {
		VoterDao vto=new VoterDaoImpl();
		List<AddElectionDto> list=vto.getongoingelection();
		return list;
	}
}
