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
	private static String selectAll = "select * from board order by `group` desc, step asc";
	private static String insertBoard = "INSERT INTO board(author,email,homepage,title,content,pw) VALUES(?, ?, ?, ?, ?, ?)";
	private static String updateBoard = "UPDATE board SET email=?, homepage=?, title=?, content=? WHERE idx=? and pw=?";
	private static String deleteBoard = "DELETE FROM board WHERE idx=? and pw=?";
	private static String increaseHit = "UPDATE board SET hit=? WHERE idx=?";
	private static String getMaxIdx = "select max(idx) as idx from board";
	private static String updateGroup = "UPDATE board SET `group`=? where idx=?";
	private static String replyBoard = "INSERT INTO board(author,email,homepage,title,content,pw,`group`,step,indent) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static String updateStep = "UPDATE board SET step = step + 1 where `group`=? and step > ?";
	private static String selectPage = "select * from board order by `group` desc, step asc limit ?,?";
	private static String getCount1 = "select count(*) as cnt from board where ";
	private static String getCount2 = " like ?";
	private static String selectSearch1 = "select * from board where ";
	private static String selectSearch2 = " like ? order by `group` desc, step asc limit ?,?";
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
				Integer group = rs.getInt("group");
				Integer step = rs.getInt("step");
				Integer indent = rs.getInt("indent");				
				board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate, group, step, indent);
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
				Integer group = rs.getInt("group");
				Integer step = rs.getInt("step");
				Integer indent = rs.getInt("indent");
				BoardDto board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate, group, step, indent);
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return boards;
	}
	
	public ArrayList<BoardDto> getBoardPage(int startNum, int endNum){
		ArrayList<BoardDto> boards = new ArrayList<BoardDto>();
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(selectPage);
			pstmt.setInt(1, startNum);
			pstmt.setInt(2, endNum);			
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
				Integer group = rs.getInt("group");
				Integer step = rs.getInt("step");
				Integer indent = rs.getInt("indent");
				BoardDto board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate, group, step, indent);
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return boards;
	}
	
	public ArrayList<BoardDto> getBoardSearch(int startNum, int endNum,String condition, String value){
		ArrayList<BoardDto> boards = new ArrayList<BoardDto>();
		String sValue = '%' + value + '%';
		String selectSearch = selectSearch1 + condition + selectSearch2;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(selectSearch);
			pstmt.setString(1, sValue);
			pstmt.setInt(2, startNum);
			pstmt.setInt(3, endNum);
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
				Integer group = rs.getInt("group");
				Integer step = rs.getInt("step");
				Integer indent = rs.getInt("indent");
				BoardDto board = new BoardDto(idx, author, email, homepage, title, content, pw, hit, regdate, group, step, indent);
				boards.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return boards;
	}
	
	public int getCount(String condition, String value) {
		String sValue = '%' + value + '%';
		String getCount = getCount1 + condition + getCount2;
		int cnt = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(getCount);
			pstmt.setString(1, sValue);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return cnt;
	}
	
	public int getMaxIdx() {
		int max = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(getMaxIdx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				max = rs.getInt("idx");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(rs, pstmt, conn);
		}
		return max;
	}
	
	public void updateGroup(int max) {
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(updateGroup);
			pstmt.setInt(1, max);
			pstmt.setInt(2, max);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
	}
	
	public void updateStep(int group, int step) {
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(updateStep);
			pstmt.setInt(1, group);
			pstmt.setInt(2, step);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
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
	
	public int replyBoard(BoardDto board) {
		int isInsert = 0;
		BoardDto origin = this.getBoardOne(board.getIdx());
		this.updateStep(origin.getGroup(), origin.getStep());
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(replyBoard);
			pstmt.setString(1,board.getAuthor());
			pstmt.setString(2,board.getEmail());
			pstmt.setString(3,board.getHomepage());
			pstmt.setString(4,board.getTitle());
			pstmt.setString(5,board.getContent()+"\n\n---이전글---\n\n"+origin.getContent());
			pstmt.setString(6,board.getPw());
			pstmt.setInt(7,origin.getGroup());
			pstmt.setInt(8,origin.getStep() + 1);
			pstmt.setInt(9,origin.getIndent() + 1);
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
			pstmt.setInt(5,board.getIdx());
			pstmt.setString(6,board.getPw());			
			isUpdate = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcutil.close(pstmt, conn);
		}
		return isUpdate;
	}
	
	public int deleteBoard(int idx, String pw) {
		int isDelete = 0;
		conn = jdbcutil.getConnection();
		try {
			pstmt = conn.prepareStatement(deleteBoard);
			pstmt.setInt(1,idx);
			pstmt.setString(2,pw);
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
