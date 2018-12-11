package com.od.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.od.Dao.VoterDao;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VoterDto;
import com.od.model.VotingDto;
import com.od.utill.JdbcConnection;

public class VoterDaoImpl implements VoterDao {
	Connection con = JdbcConnection.getConnection();

	@Override
	public int VoterReg(VoterDto vote) {
		try {
			String query = "insert into voterdetail (UserName,Date_of_Birth,Email_Id,Mobile_Number,Address,Aadhar_Card_Number,Gender,Marital_Status,Education,Image,Password,Status,UserID,WardNo1)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, vote.getUsername());
			ps.setDate(2, (Date) vote.getDob());
			ps.setString(3, vote.getEmail());
			ps.setLong(4, vote.getMnumber());
			ps.setString(5, vote.getAddress());
			ps.setLong(6, vote.getAadhar());
			ps.setString(7, vote.getGender());
			ps.setString(8, vote.getMarital());
			ps.setString(9, vote.getEducation());
			ps.setString(10, vote.getImage());
			ps.setString(11, vote.getPassword());
			ps.setInt(12, 0);
			ps.setString(13, vote.getUserid());
			ps.setInt(14, vote.getWardno());
			int raw = ps.executeUpdate();

			return raw;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public List<VoterDto> getallvoterdetail() {
		String query = "Select * from voterdetail";
		try {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			ArrayList<VoterDto> lis = new ArrayList<>();
			while (rs.next()) {
				VoterDto vote = new VoterDto();
				vote.setUsername(rs.getString("UserName"));
				vote.setDob(rs.getDate("Date_of_Birth"));
				vote.setEmail(rs.getString("Email_Id"));
				vote.setMnumber(rs.getLong("Mobile_Number"));
				vote.setAddress(rs.getString("Address"));
				vote.setAadhar(rs.getLong("Aadhar_Card_Number"));
				vote.setGender(rs.getString("Gender"));
				vote.setMarital(rs.getString("Marital_Status"));
				vote.setEducation(rs.getString("Education"));
				vote.setPassword(rs.getString("Password"));
				vote.setUserid(rs.getString("UserId"));
				vote.setImage(rs.getString("Image"));
				lis.add(vote);
			}

			return lis;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<VoterDto> gettoverifyvoter() {
		String query = "Select * from voterdetail where Status=0";
		try {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			ArrayList<VoterDto> lis = new ArrayList<>();
			while (rs.next()) {
				VoterDto vote = new VoterDto();
				vote.setUsername(rs.getString("UserName"));
				vote.setDob(rs.getDate("Date_of_Birth"));
				vote.setEmail(rs.getString("Email_Id"));
				vote.setMnumber(rs.getLong("Mobile_Number"));
				vote.setAddress(rs.getString("Address"));
				vote.setAadhar(rs.getLong("Aadhar_Card_Number"));
				vote.setGender(rs.getString("Gender"));
				vote.setMarital(rs.getString("Marital_Status"));
				vote.setEducation(rs.getString("Education"));
				vote.setPassword(rs.getString("Password"));
				vote.setUserid(rs.getString("UserId"));

				vote.setImage(rs.getString("Image"));
				lis.add(vote);
			}

			return lis;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}

	@Override
	public VoterDto getsinglevoterdetail(String s1) {
		String query = "Select * from voterdetail where UserId='" + s1 + "'";
		try {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			VoterDto vote = new VoterDto();
			while (rs.next()) {

				vote.setUsername(rs.getString("UserName"));
				vote.setDob(rs.getDate("Date_of_Birth"));
				vote.setEmail(rs.getString("Email_Id"));
				vote.setMnumber(rs.getLong("Mobile_Number"));
				vote.setAddress(rs.getString("Address"));
				vote.setAadhar(rs.getLong("Aadhar_Card_Number"));
				vote.setGender(rs.getString("Gender"));

				vote.setMarital(rs.getString("Marital_Status"));
				vote.setEducation(rs.getString("Education"));

				vote.setPassword(rs.getString("Password"));
				vote.setUserid(rs.getString("UserId"));

				vote.setImage(rs.getString("Image"));

			}

			return vote;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}

	}
	@Override
	public List getcandidatedata(int s1){
	try
	{
		
		String query="SELECT DISTINCT candidatedetail.UserName,candidatedetail.Date_of_Birth,candidatedetail.Email_Id,candidatedetail.Mobile_Number,candidatedetail.WardNo FROM candidatedetail INNER JOIN voterdetail ON voterdetail.WardNo1=candidatedetail.WardNo WHERE WardNo1='"+s1+"'";

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
			dto.setWardno(rs.getInt("WardNo"));
		boolean b=	lis.add(dto);
		}
		
		System.out.println("dao"+lis.size());
		return lis;
	}
	catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
	}		


	@Override
	public int approvevoter(String s1) {
		try {
			String query = "Update  voterdetail Set Status=1 where UserId='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
			return rs;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public int rejectreqvoter(String s1) {
		try {
			String query = "DELETE FROM voterdetail WHERE UserId='" + s1 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			int rs = ps.executeUpdate();
			return rs;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}



	@Override
	public int getvoterfromvoter(VotingDto dto) throws SQLException {
		String query = "insert into voting (CandidateName,VoterId,ElectionId) values(?,?,?)";
		
			PreparedStatement ps = con.prepareStatement(query);
		
			ps.setString(1, dto.getCandidatename());
			ps.setString(2, dto.getVoterid());
			/*ps.setTimestamp(4, dto.getCurrentdatetime());*/
			ps.setInt(3, dto.getElectionid()+1);
			int row = ps.executeUpdate();
			return row;
		

	}

	@Override
	public VoterDto getauthntication(String s1, String s2) {
		String query = "select * from voterdetail where UserID='" + s1 + "' and Password='" + s2 + "'";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			VoterDto dto = new VoterDto();
			while (rs.next()) {
				int i=rs.getInt("WardNo1");
                dto.setWardno(i);
				dto.setUserid(rs.getString("UserID"));
				dto.setPassword(rs.getString("Password"));

			}
			return dto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean getvotedvoterlist(String s1, String s2) {
		String query = "Select * from count_vote where VoterId='" + s2 + "' and Election_Id='" + s1 + "' ";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) 
			{
				String s3 = rs.getString("VoterId");

				if (s2.equals(s3)) 
				{
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}
	@Override
	public List<AddElectionDto> getongoingelection() {
		try {
			String query = "Select * from upcomingelectiondetail where Election_Status='Start'";

			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<AddElectionDto> arr = new ArrayList<>();
			while (rs.next()) {
				AddElectionDto dto = new AddElectionDto();
				dto.setTid(rs.getInt("TId"));
				dto.setPosition(rs.getString("Name_Position"));
				dto.setDateofelection(rs.getDate("Date of Election"));
				dto.setDateofresult(rs.getDate("Result Date"));
				arr.add(dto);
			}
			return arr;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	

}