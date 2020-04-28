package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MemberDao {
	//dbcp 사용
	
	private static MemberDao instance = new MemberDao();
	private static String sqlSelect = "SELECT * FROM member limit ?";
	private static String sqlCheck = "SELECT count(id) as cnt FROM member WHERE id=?";
	private static String sqlInsert = "INSERT INTO member(id,pw,name,email,address) values(?,?,?,?,?)";
	private static String sqlLogin = "SELECT name FROM member WHERE id=? and pw=?";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MemberDao() {
	}
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	public ArrayList<MemberDto> memberSelect(int cnt) {
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setInt(1, cnt);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String regdate = rs.getString("regdate");
				MemberDto dto = new MemberDto(id, pw, name, email, address, regdate); 
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return dtos;
	}
	
	public int checkId(String id) {
		int exist = 0;
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlCheck);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				exist = rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return exist;
	}
	
	public int memberInsert(MemberDto dto) {
		int ri = 0;
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAddress());
			ri = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return ri;
	}
	
	public String memberLogin(String id, String pw) {
		String confirm = null;
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlLogin);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				confirm = rs.getString("name");
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return confirm;
	}
}
