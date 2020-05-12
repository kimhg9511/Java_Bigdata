package com.bigdata.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bigdata.common.JDBCUtil;
import com.bigdata.dto.JoinDto;
import com.bigdata.dto.MemberInfoDto;

public class JoinDao {

	private static JoinDao instance = new JoinDao();

	// dbcp 사용
	private  JoinDao() {
	}

	public static JoinDao getInstance() {
		return instance;
	}

	private Connection getConnection() {
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		return conn;
	}

	public ArrayList<JoinDto> getMemberList(){
		ArrayList<JoinDto> members = new ArrayList<JoinDto>();
		JoinDto member = null;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;

		String sql = "select * from members order by regdate desc";
		// conn

		try {
			conn = getConnection(); // conn
			pstmt = conn.prepareStatement(sql); // sql
			rs = pstmt.executeQuery(); // execute

			// rs에서 값 꺼내기
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String nickname = rs.getString("nickname");
				String email = rs.getString("email");
				String regdate = rs.getString("regdate");

				// 회원한명 생성
				member = new JoinDto(idx, id, pw, name, nickname, email, regdate);
				// 각 방에 집어넣기
				members.add(member);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return members;
	}

	public JoinDto getMember(String id){
		JoinDto member = null;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;
		System.out.println(id);
		String sql = "select * from members where id = ?";
		// conn

		try {
			conn = getConnection(); // conn
			pstmt = conn.prepareStatement(sql); // sql
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // execute

			// rs에서 값 꺼내기
			if(rs.next()) {
				int idx = rs.getInt("idx");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String nickname = rs.getString("nickname");
				String email = rs.getString("email");
				String regdate = rs.getString("regdate");

				// 회원한명 생성
				member = new JoinDto(idx, id, pw, name, nickname, email, regdate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return member;
	}

	public int joinInsert(JoinDto dto){
		int ri = 0;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;

		String sql = "insert into members (id,pw,name,nickname,email) values (?,?,?,?,?)";
		// conn

		try {
			conn = getConnection(); // conn
			pstmt = conn.prepareStatement(sql); // sql
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getNickname());
			pstmt.setString(5, dto.getEmail());
			ri = pstmt.executeUpdate(); // insert -> executeUpdate()

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return ri;
	}

	public int joinUpdate(JoinDto dto){
		int ri = 0;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;

		String sql = "update members set pw=?, name=?, nickname=?,email=? where id=?";

		try {
			conn = getConnection(); // db 연결
			pstmt = conn.prepareStatement(sql); // sql
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getNickname());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getId());
			ri = pstmt.executeUpdate(); // update -> executeUpdate()

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return ri;
	}

	public int joinDelete(String id){
		int ri = 0;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;

		String sql = "delete from members where id=?";

		try {
			conn = getConnection(); // db 연결
			pstmt = conn.prepareStatement(sql); // sql
			pstmt.setString(1, id);
			ri = pstmt.executeUpdate(); // update -> executeUpdate()

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return ri;
	}














}
