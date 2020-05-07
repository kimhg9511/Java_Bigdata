package com.bigdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bigdata.common.jdbcutil;
import com.bigdata.dto.BoardDto;

public class BoardDao {	
	//Singleton Object
	private static BoardDao instance = new BoardDao();
	
	//SQL Querys
	private static String selectOne = "SELECT * FROM board WHERE idx=?";
	private static String selectAll = "SELECT * FROM board order by idx desc";
	private static String insertBoard = "INSERT INTO board(author,email,homepage,title,content,pw) VALUES(?, ?, ?, ?, ?, ?)";
	private static String updateBoard = "UPDATE board SET email=?, homepage=?, title=?, content=? WHERE author=? and pw=?";
	private static String deleteBoard = "DELETE FROM board WHERE idx=? and pw=?";
	private static String increaseHit = "UPDATE board SET hit=? WHERE idx=?";
	//Connection Objects
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private BoardDao() {
	}
	
	public static BoardDao getInstance() {
		return instance;
	}
	
	public BoardDto getBoardOne(int idx) {
		BoardDto board = null;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String author = rs.getString("author");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				Integer hit = rs.getInt("hit");
				String regdate = rs.getString("regdate");
				board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return board;
	}
	
	public ArrayList<BoardDto> getBoardAll() {
		ArrayList<BoardDto> boards = new ArrayList<BoardDto>();
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(selectAll);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Integer idx = rs.getInt("idx");
				String author = rs.getString("author");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				Integer hit = rs.getInt("hit");
				String regdate = rs.getString("regdate");
				BoardDto board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate);
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return boards;
	}
	
	public int insertBoard(BoardDto board) {
		int isInsert = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(insertBoard);
			pstmt.setString(1,board.getAuthor());
			pstmt.setString(2,board.getEmail());
			pstmt.setString(3,board.getHomepage());
			pstmt.setString(4,board.getTitle());
			pstmt.setString(5,board.getContent());
			pstmt.setString(6,board.getPw());
			isInsert = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return isInsert;
	}
	public int updateBoard(BoardDto board) {
		int isUpdate = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(updateBoard);
			pstmt.setString(1,board.getEmail());
			pstmt.setString(2,board.getHomepage());
			pstmt.setString(3,board.getTitle());
			pstmt.setString(4,board.getContent());
			pstmt.setString(5,board.getAuthor());
			pstmt.setString(6,board.getPw());			
			isUpdate = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return isUpdate;
	}
	public int deleteBoard(BoardDto board) {
		int isDelete = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(deleteBoard);
			pstmt.setString(1,board.getAuthor());
			pstmt.setString(2,board.getPw());
			isDelete = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return isDelete;
	}
	
	public int increaseHit(int idx, BoardDto board) {
		int hit = board.getHit()+1;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(increaseHit);
			pstmt.setInt(1, hit);
			pstmt.setInt(2, idx);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return hit;
	}
}
