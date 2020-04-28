package bigdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MembersDao {
	//dbcp 사용
	
	private static MembersDao instance = new MembersDao();
	private static String sqlSelect = "SELECT * FROM members limit ?";
	private static String sqlCheck = "SELECT count(id) as cnt FROM members WHERE id=?";
	private static String sqlInsert = "INSERT INTO members(id,password,nickname,name,email) values(?,?,?,?,?)";
	private static String sqlLogin = "SELECT name, nickname FROM members WHERE id=? and password=?";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MembersDao() {
	}
	
	public static MembersDao getInstance() {
		return instance;
	}
	
	public ArrayList<MembersDto> membersSelect(int cnt) {
		ArrayList<MembersDto> dtos = new ArrayList<MembersDto>();
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setInt(1, cnt);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String uid = rs.getString("id");
				String upw = rs.getString("password");
				String nick = rs.getString("nickname");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String regdate = rs.getString("date");
				MembersDto dto = new MembersDto(uid, upw, nick, name, email, regdate); 
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
	
	public int membersInsert(MembersDto dto) {
		int ri = 0;
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, dto.getUid());
			pstmt.setString(2, dto.getUpw());
			pstmt.setString(3, dto.getNick());
			pstmt.setString(4, dto.getName());
			pstmt.setString(5, dto.getEmail());
			ri = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return ri;
	}
	
	public String[] membersLogin(String id, String pw) {
		String[] confirm = {"", ""};
		try {
			conn = jdbcutil.getConnection();
			pstmt = conn.prepareStatement(sqlLogin);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				confirm[0] = rs.getString("name");
				confirm[1] = rs.getString("nickname");
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return confirm;
	}
}
