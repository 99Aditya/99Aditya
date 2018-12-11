package com.od.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.od.Dao.AdminDao;
import com.od.model.AddAdminDto;
import com.od.model.AddElectionDto;
import com.od.model.CandidateDto;
import com.od.model.VotingDto;
import com.od.utill.JdbcConnection;

public class AdminDaoImpl implements AdminDao {
	Connection con = JdbcConnection.getConnection();

	@Override
	public int doAdd(AddAdminDto admin) {
		try {

			String query = "insert into admindetail values(?,?,?,?,?,?,?,?)";
			System.out.println(admin.getUname());
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, admin.getUname());
			ps.setString(2, admin.getEmail());
			ps.setLong(3, admin.getCnum());

			ps.setString(4, admin.getUserid());
			ps.setString(5, admin.getPassword());
			ps.setString(6, admin.getDesignation());
			ps.setDate(7, (Date) admin.getDob());
			ps.setBlob(8, admin.getImage());

		int row=ps.executeUpdate();
			System.out.println("admin dao after update");
			return row;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public int addelection(AddElectionDto addto) {
		try {
			String query = "insert into upcomingelectiondetail values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 0);
			ps.setString(2, addto.getPosition());
			ps.setString(3, addto.getQualification());
			ps.setInt(4, addto.getNuapplication());
			ps.setDate(5, (Date) addto.getDateofelection());
			ps.setDate(6, (Date) addto.getDateofresult());
			ps.setInt(7, 0);
			ps.setString(8, null);
			ps.setDate(9, (Date) addto.getRegistrationstartdate());
			ps.setDate(10, (Date) addto.getRegistrationstopdate());
			int row = ps.executeUpdate();
			return row;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public List<AddElectionDto> getelectiondetail() {
		try {
			String query = "Select * from upcomingelectiondetail where status=0";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<AddElectionDto> arr = new ArrayList<>();
			while (rs.next()) {
				AddElectionDto dto = new AddElectionDto();
				dto.setTid(rs.getInt("TId"));
				dto.setPosition(rs.getString("Name_Position"));
				dto.setDateofelection(rs.getDate("Date of Election"));
				dto.setDateofresult(rs.getDate("Result Date"));
				dto.setRegistrationstartdate(rs.getDate("Registration Start Date"));
				dto.setRegistrationstopdate(rs.getDate("Registration End Date"));
				arr.add(dto);
			}
			return arr;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	@Override
	public int startelection(String s1) {
		String query = "update upcomingelectiondetail set Election_Status='Start' where TId= '" + s1
				+ "'";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int row = ps.executeUpdate();
			System.out.println(row);
			return row;
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public int stopelection(String s1) {
		String query = "update upcomingelectiondetail set Election_Status='Stop' where TId= '" + s1
				+ "'";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			int row = ps.executeUpdate();
			return row;
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<CandidateDto> getelectionresult(String s1) {
		String query = "SELECT CandidateID, COUNT(CandidateID)FROM count_vote WHERE Election_Id='" + s1
				+ "' GROUP BY CandidateID";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ArrayList<CandidateDto> arr = new ArrayList<>();
			while (rs.next()) {
				CandidateDto dto = new CandidateDto();
				dto.setUserid(rs.getString("CandidateID"));
				dto.setNumberofvote(rs.getInt("count(CandidateID)"));
				arr.add(dto);
			}
			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<VotingDto> getelectiondetailsforresult() {
		String query="SELECT COUNT(ElectionId),CandidateName FROM voting  GROUP BY ElectionId,CandidateName" ;
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

			



	@Override
	public AddAdminDto getauthnticate(String s1, String s2) {
		try {
			String query = "Select * from admindetail where User_Id='" + s1 + "' and Password='" + s2 + "'";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			AddAdminDto dto = new AddAdminDto();
			if (rs.next()) {
				dto.setUserid(rs.getString("User_Id"));
				dto.setPassword(rs.getString("Password"));
			}
			return dto;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public int updatepassword(String s1, String s2) {
		try {
			String query = "update voterdetail set Password='" + s2 + "' where UserID='" + s1 + "' ";
			PreparedStatement ps = con.prepareStatement(query);
			int row = ps.executeUpdate();
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

}
