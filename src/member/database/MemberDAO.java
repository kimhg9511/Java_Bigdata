package member.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
//singleton
	//Instance
	private static MemberDAO dao = new MemberDAO();
	//private constructor
	private MemberDAO() {
		System.out.println("Singleton DAO created.");
	}
	//return singleton object
	public static MemberDAO getInstance() {
		return dao;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// SQL
	private final String MEMBER_INSERT = "insert into member(age,name,tel,email,nation) values (?,?,?,?,?);";
	private final String MEMBER_UPDATE = "update member set age = ?, email = ?, tel = ?, nation = ? where idx = ?;";
	private final String MEMBER_DELETE = "delete from member where idx=?;";
	private final String MEMBER_GET = "select idx,age,name,tel,email,nation,regdate from member where idx=?;";
	private final String MEMBER_LIST = "select idx,age,name,tel,email,nation,regdate from member order by regdate desc";
	private final String MEMBER_GETBYNAME = "select * from member where name like ?;";
	private final String MEMBER_SEARCH = "select * from member where idx = ?;";

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
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

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
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

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
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	int deleteMember(int idx) {
		int isDelete = 0;
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_DELETE);
			pstmt.setInt(1, idx);

			isDelete = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isDelete;
	}

	ArrayList<MemberVO> searchMember(String sName) {

		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			sName = "%" + sName + "%";
			pstmt = conn.prepareStatement(MEMBER_GETBYNAME);
			pstmt.setString(1, sName);
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
				members.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return members;
	}

	MemberVO searchMemberIdx(int idx) {
		MemberVO member = new MemberVO();
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("connection ok");

			pstmt = conn.prepareStatement(MEMBER_SEARCH);
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
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return member;
	}
}
