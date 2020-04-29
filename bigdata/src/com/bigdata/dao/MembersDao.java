package com.bigdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bigdata.common.jdbcutil;
import com.bigdata.dto.MembersDto;

public class MembersDao {	
	//Singleton Object
	private static MembersDao instance = new MembersDao();
	
	//SQL Querys
	private static String createMember = "INSERT INTO members(id,password,nickname,name,email) VALUES(?,?,?,?,?)";
	private static String selectOne = "SELECT * FROM members WHERE id=?";
	private static String login = selectOne + " AND password=?";
	private static String selectAll = "SELECT * FROM members ORDER BY date DESC";
	private static String updateMember = "UPDATE";
	private static String deleteMember = "DELETE FROM members WHERE id=? AND password=?";
	
	//Connection Objects
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MembersDao() {
	}
	
	public static MembersDao getInstance() {
		return instance;
	}
	
	public int createMember(MembersDto member) {
		int isCreate = 0;
		conn = jdbcutil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(createMember);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getNickname());
			pstmt.setString(4, member.getName());
			pstmt.setString(5, member.getEmail());
			isCreate = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return isCreate;
	}
	
	public MembersDto selectOne(String id) {
		MembersDto member = null;
		conn = jdbcutil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String password = rs.getString("password");
				String nickname = rs.getString("nickname");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String date = rs.getString("date");
				member = new MembersDto(id, password, nickname, name, email, date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		
		return member;
	}
	
	public MembersDto login(String id,String password) {
		MembersDto member = null;
		conn = jdbcutil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(login);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String nickname = rs.getString("nickname");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String date = rs.getString("date");
				member = new MembersDto(id, password, nickname, name, email, date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		
		return member;
	}
	
	public ArrayList<MembersDto> selectAll() {
		ArrayList<MembersDto> members = new ArrayList<MembersDto>();
		conn = jdbcutil.getConnection();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String nickname = rs.getString("nickname");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String date = rs.getString("date");
				MembersDto member = new MembersDto(id, password, nickname, name, email, date);
				members.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		
		return members;
	}
}
