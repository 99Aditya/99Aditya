package com.od.serviceimpl;

import java.util.List;

import com.od.Dao.AdminDao;
import com.od.DaoImpl.AdminDaoImpl;
import com.od.model.AddAdminDto;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VotingDto;
import com.od.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public int addadmin(AddAdminDto admin) {
		if (admin != null) {
			AdminDao ad = new AdminDaoImpl();
			int row = ad.doAdd(admin);
			return row;
		}

		return 0;
	}

	@Override
	public int addelection(AddElectionDto addto) {
		if (addto != null) {
			AdminDao ad = new AdminDaoImpl();
			int row = ad.addelection(addto);
			return row;
		}
		return 0;
	}

	@Override
	public List<AddElectionDto> getelectiondetails() {
		AdminDao dao = new AdminDaoImpl();
		List<AddElectionDto> lis = dao.getelectiondetail();
		return lis;
	}

	@Override
	public int startelection(String s1) {
		AdminDao dao = new AdminDaoImpl();
		int row = dao.startelection(s1);
		return row;
	}

	@Override
	public int stopelection(String s1) {
		AdminDao dao = new AdminDaoImpl();
		int row = dao.stopelection(s1);
		return row;
	}

	@Override
	public List<CandidateDto> getelectionresult(String s1) {
		AdminDao dao = new AdminDaoImpl();
		List<CandidateDto> list = dao.getelectionresult(s1);
		return list;
	}

	@Override
	public List<VotingDto> getelectiondetailsforresult(String s1) {
		AdminDao dao = new AdminDaoImpl();
		List<VotingDto> list = dao.getelectiondetailsforresult();
		return list;

	}

	@Override
	public AddAdminDto getauthnticate(String s1, String s2) {
		AdminDao dao = new AdminDaoImpl();
		AddAdminDto dto=dao.getauthnticate(s1,s2);
		return dto;
	}

	@Override
	public int updatepassword(String s1, String s2) {
		AdminDao admin=new AdminDaoImpl();
		int row=admin.updatepassword(s1,s2);
		return row;
	}

}
