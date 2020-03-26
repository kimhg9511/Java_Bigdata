package chap14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// SQL
	private final String MEMBER_INSERT = "insert into member(age,name,tel,email,nation) values (?,?,?,?,?);";
	private final String MEMBER_UPDATE = "update member set age = ?, email = ?, tel = ?, nation = ? where idx = ?;";
	private final String MEMBER_DELETE = "delete from member where idx=?;";
	private final String MEMBER_GET = "select idx,age,name,tel,email,nation,regdate from member where idx=?;";
	private final String MEMBER_LIST = "select idx,age,name,tel,email,nation,regdate from member order by regdate desc";
	private final String MEMBER_GETBYNAME = "select * from member where name=?;";

	ArrayList<MemberVO> getMemberList() {
		System.out.println("getMemberList()");
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		try {

			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_LIST);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int idx = rs.getInt("idx");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation = rs.getString("nation");
				String regdate = rs.getString("regdate");
				MemberVO member = new MemberVO(idx, age, name, tel, email, nation, regdate);
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return memberList;
	}

	MemberVO getMember(int idx) {
		MemberVO member = new MemberVO();
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_GET);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation = rs.getString("nation");
				String regdate = rs.getString("regdate");
				member = new MemberVO(idx, age, name, tel, email, nation, regdate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}

	void insertMember(MemberVO member) {
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_INSERT);

			pstmt.setInt(1, member.getAge());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getTel());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getNation());
			pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void updateMember(MemberVO member) {
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_UPDATE);
			pstmt.setInt(1, member.getAge());
			pstmt.setString(2, member.getTel());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getNation());
			pstmt.setInt(5, member.getIdx());

			pstmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void deleteMember(int idx) {
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_DELETE);
			pstmt.setInt(1, idx);

			pstmt.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	MemberVO searchMember(String name) {
		MemberVO member = new MemberVO();
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_GETBYNAME);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int idx = rs.getInt("idx");
				int age = rs.getInt("age");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation = rs.getString("nation");
				String regdate = rs.getString("regdate");
				member = new MemberVO(idx, age, name, tel, email, nation, regdate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	
}
