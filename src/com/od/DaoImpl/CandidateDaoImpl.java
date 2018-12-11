
package com.od.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.od.Dao.CandidateDao;
import com.od.controller.GetVoteController;
import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;
import com.od.utill.JdbcConnection;

public class CandidateDaoImpl implements CandidateDao {
	Connection con = JdbcConnection.getConnection();

	@Override
	public int regCandidate(CandidateDto cand) {
		try {

			int n = UserId.generateuserid("SELECT MAX(UserId) AS LastUserId FROM candidatedetail");
			String query = "insert into candidatedetail values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, cand.getUsername());
			ps.setDate(2, (Date) cand.getDob());
			ps.setString(3, cand.getEmail());
			ps.setLong(4, cand.getMnumber());
			ps.setString(5, cand.getAddress());
			ps.setString(6, cand.getVoterid());
			ps.setLong(7, cand.getAadhar());
			ps.setString(8, cand.getGender());
			ps.setString(9, cand.getMarital());
			ps.setString(10, cand.getEducation());
			ps.setString(11, cand.getImage());
			ps.setString(13,cand.getPassword());
			ps.setInt(16, cand.getWardno());
			ps.setString(17, cand.getPosition());
			String id = "CANDO" + (n + 1);
			ps.setString(12, id);
		/*	ps.setString(13, null);*/
			ps.setInt(14, 1);
			ps.setInt(15, cand.getElectionid());
			int row = ps.executeUpdate();

			return row;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public List<CandidateDto> gettoverifycandidate() {
		try {
			String query = "Select * from candidatedetail where status=1";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<CandidateDto> lis = new ArrayList<>();
			System.out.println(lis);
			while (rs.next()) {
				CandidateDto dto = new CandidateDto();
				dto.setUsername(rs.getString("UserName"));
				dto.setDob(rs.getDate("Date_of_Birth"));
				dto.setEmail(rs.getString("Email_Id"));
				dto.setMnumber(rs.getLong("Mobile_Number"));
				dto.setAddress(rs.getString("Address"));
				dto.setVoterid(rs.getString("Voter_Id"));
				dto.setAadhar(rs.getLong("Aadhar"));
				dto.setGender(rs.getString("Gender"));
				dto.setMarital(rs.getString("Marital_Status"));
				dto.setEducation(rs.getString("Education"));

				dto.setUserid(rs.getString("UserId"));

				//dto.setPosition(rs.getString("Election_Id"));
				dto.setImage(rs.getString("Image"));
				lis.add(dto);

			}
			return lis;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	@Override
	public List getvoterdata(int s1){
	try
	{
		
		String query="SELECT DISTINCT voterdetail.UserName,voterdetail.Date_of_Birth,voterdetail.Email_Id,voterdetail.Mobile_Number,voterdetail.WardNo1 FROM candidatedetail INNER JOIN voterdetail ON candidatedetail.WardNo=voterdetail.WardNo1 WHERE WardNo='"+s1+"'";

		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<VoterDto> lis = new ArrayList<>();
		System.out.println(lis);
		while (rs.next()) {
			VoterDto dto = new VoterDto();
			
			dto.setUsername(rs.getString("UserName"));
			dto.setDob(rs.getDate("Date_of_Birth"));
			dto.setEmail(rs.getString("Email_Id"));
			dto.setMnumber(rs.getLong("Mobile_Number"));
			dto.setWardno(rs.getInt("WardNo1"));
			lis.add(dto);
		}
		return lis;
	}
	catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
		
		
		
	}
	@Override
	public CandidateDto getcandidatedetail(String s1) {
		try {
			String query = "Select * from candidatedetail where UserId='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			CandidateDto cdm = new CandidateDto();

			if (rs.next()) {
				cdm.setUserid(rs.getString("UserId"));
				cdm.setUsername(rs.getString("UserName"));
				cdm.setDob(rs.getDate("Date_of_Birth"));
				cdm.setEmail(rs.getString("Email_Id"));
				cdm.setMnumber(rs.getLong("Mobile_Number"));
				cdm.setAddress(rs.getString("Address"));
				cdm.setVoterid(rs.getString("Voter_Id"));
				cdm.setAadhar(rs.getLong("Aadhar"));
				cdm.setGender(rs.getString("Gender"));
				cdm.setMarital(rs.getString("Marital_Status"));
				cdm.setEducation(rs.getString("Education"));

				cdm.setElectionid(rs.getInt("Election_Id"));
				cdm.setImage(rs.getString("Image"));
			}
			return cdm;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public int apprvovecandidate(String s1, String pass) {
		try {
			String query = "Update candidatedetail Set Status=1,Passwords='" + pass + "' where UserId='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
			return rs;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public int rejectcandidate(String s1) {
		try {
			String query = "DELETE FROM candidatedetail WHERE UserId='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
			return rs;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public List<CandidateDto> viewallcandidatedetail() {
		try {
			String query = "Select * from candidatedetail";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<CandidateDto> lis = new ArrayList<>();

			while (rs.next()) {
				CandidateDto dto = new CandidateDto();
				dto.setUsername(rs.getString("UserName"));
				dto.setDob(rs.getDate("Date_of_Birth"));
				dto.setEmail(rs.getString("Email_Id"));
				dto.setMnumber(rs.getLong("Mobile_Number"));
				dto.setAddress(rs.getString("Address"));
				dto.setVoterid(rs.getString("Voter_Id"));
				dto.setAadhar(rs.getLong("Aadhar"));
				dto.setGender(rs.getString("Gender"));
				dto.setMarital(rs.getString("Marital_Status"));
				dto.setEducation(rs.getString("Education"));

				dto.setUserid(rs.getString("UserId"));

				dto.setElectionid(rs.getInt("Election_Id"));
				dto.setImage(rs.getString("Image"));
				lis.add(dto);

			}
			return lis;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public CandidateDto getcandidatedetailbyposition(String s1) {
		try {
			String query = "Select * from candidatedetail where  UserId='" + s1 + "' ";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			CandidateDto cdm = new CandidateDto();

			if (rs.next()) {
				cdm.setUserid(rs.getString("UserId"));
				cdm.setUsername(rs.getString("UserName"));
				cdm.setDob(rs.getDate("Date_of_Birth"));
				cdm.setEmail(rs.getString("Email_Id"));
				cdm.setMnumber(rs.getLong("Mobile_Number"));
				cdm.setAddress(rs.getString("Address"));
				cdm.setVoterid(rs.getString("Voter_Id"));
				cdm.setAadhar(rs.getLong("Aadhar"));
				cdm.setGender(rs.getString("Gender"));
				cdm.setMarital(rs.getString("Marital_Status"));
				cdm.setEducation(rs.getString("Education"));

				cdm.setElectionid(rs.getInt("Election_Id"));
				cdm.setImage(rs.getString("Image"));
			}
			return cdm;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<CandidateDto> getcandidatelist(String s1) {
		try {
			String query = "Select * from candidatedetail where Election_Id='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			ArrayList<CandidateDto> arr = new ArrayList<>();
			while (rs.next()) {
				CandidateDto dto = new CandidateDto();

				dto.setUsername(rs.getString("UserName"));
				dto.setUserid(rs.getString("UserId"));
				arr.add(dto);

			}
System.out.println("dao"+arr.size());
			return arr;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	@Override
	public CandidateDto getauthnticate(String s1, String s3) {
		String query = "Select * from candidatedetail where UserId='" + s1 + "' ";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			CandidateDto dto = new CandidateDto();
			while (rs.next()) {
			int i=rs.getInt("WardNo");
                dto.setWardno(i);
                dto.setUsername(rs.getString("UserName"));
				dto.setUserid(rs.getString("UserId"));
				dto.setPassword(rs.getString("Passwords"));

			}
			return dto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<CandidateDto> getspecificcandidatelist(String s1) {
		String query = "SELECT * FROM candidatedetail WHERE Election_Id=(SELECT Election_Id FROM candidatedetail WHERE UserId='"
				+ s1 + "')";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<CandidateDto> list = new ArrayList<>();
			while (rs.next()) {
				CandidateDto dto = new CandidateDto();
				dto.setUsername(rs.getString("UserName"));
				dto.setDob(rs.getDate("Date_of_Birth"));
				dto.setEmail(rs.getString("Email_Id"));
				dto.setMnumber(rs.getLong("Mobile_Number"));
				dto.setAddress(rs.getString("Address"));
				dto.setVoterid(rs.getString("Voter_Id"));
				dto.setAadhar(rs.getLong("Aadhar"));
				dto.setGender(rs.getString("Gender"));
				dto.setMarital(rs.getString("Marital_Status"));
				dto.setEducation(rs.getString("Education"));

				dto.setUserid(rs.getString("UserId"));

				dto.setPosition(rs.getString("Election_Id"));
				dto.setImage(rs.getString("Image"));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<VotingDto> getelectionresultbyid(String s1) {
		String query="SELECT COUNT(ElectionId),CandidateName FROM voting  WHERE CandidateName='"+s1+"' GROUP BY ElectionId" ;
;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<VotingDto> list = new ArrayList<>();
			while(rs.next()) {
				VotingDto dto = new VotingDto();
				/*dto.setUserid(rs.getString("CandidateID"));
				dto.setNumberofvote(rs.getInt("count(CandidateID)"));*/
				dto.setCandidatename(rs.getString("CandidateName"));
				System.out.println("before election id");
				dto.setElectionid(rs.getInt("COUNT(ElectionId)"));;
				list.add(dto);
			}
			System.out.println("dao listt"+list.size());
			return list;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

	
}
