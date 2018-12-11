
package com.od.serviceimpl;

import java.util.List;

import com.od.Dao.CandidateDao;
import com.od.DaoImpl.CandidateDaoImpl;
import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;
import com.od.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {

	@Override
	public int CandidateReg(CandidateDto cand)
	{
		if(cand!=null)
		{
			
			CandidateDao cad=new CandidateDaoImpl();
			int row=cad.regCandidate(cand);
			return row;
		}
		return 0;
	}

	@Override
	public List<CandidateDto> gettoverifycandidate() {
		CandidateDao cav=new CandidateDaoImpl();
		List<CandidateDto> veri =cav.gettoverifycandidate();
		return veri;
		
	}

	@Override
	public CandidateDto getcandidatedetail(String s1) {
		CandidateDao cas=new CandidateDaoImpl();
		CandidateDto i=cas.getcandidatedetail(s1);
		return i;
	}

	@Override
	public int apprvovecandidate(String s1,String pass) {
		CandidateDao app=new CandidateDaoImpl();
		int i=app.apprvovecandidate(s1,pass);
		return i;
	}

	@Override
	public int rejectcandidate(String s1) {
		CandidateDao cans=new CandidateDaoImpl();
		int i=cans.rejectcandidate(s1);
		return i;
	}

	@Override
	public List<CandidateDto> viewallcandidatedetail(){
		CandidateDao ca=new CandidateDaoImpl();
		List<CandidateDto> list=ca.viewallcandidatedetail();
		return list;
	}

	@Override
	public CandidateDto getallcandidatebyposition(String s1) {
		CandidateDao ca=new CandidateDaoImpl();
		CandidateDto i=ca.getcandidatedetailbyposition(s1);
		return i;
	}

	@Override
	public List<CandidateDto> getcandidatelist(String s1) {
		CandidateDao cand=new CandidateDaoImpl();
		List<CandidateDto> list=cand.getcandidatelist(s1);
		return list;
	}

	@Override
	public CandidateDto getauthnticate(String s1, String s3) {
		CandidateDao cand=new CandidateDaoImpl();
		CandidateDto i=cand.getauthnticate(s1,s3);
		return i;
	}

	@Override
	public List<CandidateDto> getspecificcandidatelist(String s1) {
		CandidateDao cand=new CandidateDaoImpl();
		List<CandidateDto> i=cand.getspecificcandidatelist(s1);
		return i;
	}
	
	public List<VoterDto> getvoterdata(int s1)
	{
		CandidateDao n=new CandidateDaoImpl();
		List<VoterDto> i=n.getvoterdata(s1);
		return i;
		
	}
	@Override
	public List<VotingDto> getelectionresultbyid(String s1) {
		CandidateDao cand=new CandidateDaoImpl();
		List<VotingDto> i=(List<VotingDto>) cand.getelectionresultbyid(s1);
		return i;
	
	}

}
