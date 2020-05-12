package com.bigdata.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bigdata.common.JDBCUtil;
import com.bigdata.dto.MemberInfoDto;

public class MemberInfoDao {

	private static MemberInfoDao instance = new MemberInfoDao();

	// dbcp 사용
	private  MemberInfoDao() {
	}

	public static MemberInfoDao getInstance() {
		return instance;
	}

	private Connection getConnection() {
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		return conn;
	}

	public ArrayList<MemberInfoDto> getMemberList(){
		ArrayList<MemberInfoDto> members = new ArrayList<MemberInfoDto>();
		MemberInfoDto member = null;

		// 1. DB 에서 꺼내와
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs  = null;

		String sql = "select * from memberinfo order by regdate desc";
		// conn

		try {
			conn = getConnection(); // conn
			pstmt = conn.prepareStatement(sql); // sql
			rs = pstmt.executeQuery(); // execute

			// rs에서 값 꺼내기
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String regdate = rs.getString("regdate");

				// 회원한명 생성
				member = new MemberInfoDto(id, pw, name, email, address, regdate);
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

















}
