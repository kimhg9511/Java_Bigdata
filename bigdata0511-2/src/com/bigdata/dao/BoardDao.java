package com.bigdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bigdata.common.JDBCUtil;
import com.bigdata.dto.BoardDto;
import com.bigdata.dto.BoardFileDto;
import com.bigdata.dto.JoinDto;
import com.bigdata.dto.MemberInfoDto;

public class BoardDao {

	private static BoardDao instance = new BoardDao();
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// dbcp 사용
	private  BoardDao() {
	}

	public static BoardDao getInstance() {
		return instance;
	}

	private Connection getConnection() {
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		return conn;
	}

	// 글 1개 가저오기
	public BoardDto getBoardOne(int idx) {
		BoardDto board = null;
		String sql = "select * from board where idx=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				int hit = rs.getInt("hit");
				int group = rs.getInt("group");
				int step = rs.getInt("step");
				int indent = rs.getInt("indent");
				String regdate = rs.getString("regdate");

				board = new BoardDto(idx, name, email, homepage, title, content, pw, hit, regdate, group, step, indent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return board;
	}

	// 글목록 전체 가저오기
	public ArrayList<BoardDto> getBoardAll(int pageNum, int pageList) {
		ArrayList<BoardDto> boards = new ArrayList<BoardDto>();
		BoardDto board = null;

		String sql = " select * from board order by `group` desc, step asc ";
		sql += " limit ?,? ";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,pageList*(pageNum-1) );
			pstmt.setInt(2, pageList);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				int hit = rs.getInt("hit");
				int group = rs.getInt("group");
				int step = rs.getInt("step");
				int indent = rs.getInt("indent");
				String regdate = rs.getString("regdate");

				board = new BoardDto(idx, name, email, homepage, title, content, pw, hit, regdate, group, step, indent);
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return boards;
	}


	// 파일추가 글목록 전체 가저오기
	public ArrayList<BoardFileDto> getBoardFileAll(int pageNum, int pageList) {
		ArrayList<BoardFileDto> boards = new ArrayList<BoardFileDto>();
		BoardFileDto board = null;

		String sql = " select * from board order by `group` desc, step asc ";
		sql += " limit ?,? ";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,pageList*(pageNum-1) );
			pstmt.setInt(2, pageList);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				int hit = rs.getInt("hit");
				int group = rs.getInt("group");
				int step = rs.getInt("step");
				int indent = rs.getInt("indent");
				String regdate = rs.getString("regdate");
				String filename = rs.getString("filename");

				board = new BoardFileDto(idx, name, email, homepage, title, content, pw, hit, regdate, group, step, indent, filename);
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return boards;
	}


	// 글 검색 목록 전체 가저오기
	public ArrayList<BoardDto> getBoardSearch(int pageNum, int pageList, String keyWord, String searchWord) {
		ArrayList<BoardDto> boards = new ArrayList<BoardDto>();
		BoardDto board = null;

		String sql = " select * from board where "+ keyWord +" like ?  order by `group` desc, step asc ";
		sql += " limit ?,? ";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%"+searchWord+"%" );
			pstmt.setInt(2,pageList*(pageNum-1) );
			pstmt.setInt(3, pageList);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String pw = rs.getString("pw");
				int hit = rs.getInt("hit");
				int group = rs.getInt("group");
				int step = rs.getInt("step");
				int indent = rs.getInt("indent");
				String regdate = rs.getString("regdate");

				board = new BoardDto(idx, name, email, homepage, title, content, pw, hit, regdate, group, step, indent);
				boards.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return boards;
	}


	// 조회수 증가
	public void setBoardHit(int idx) {
		String sql = "update board set hit = hit + 1 where idx=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}

	// 글쓰기 insert
	public int setBoardWrite(BoardDto board) {
		int ri = 0;

		// idx 값 가져오기
		int idx = getIdx();

		String sql = "insert into board(idx, name, email, homepage, title, content, pw, `group`) ";
		sql = sql + " values(?,?,?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getHomepage());
			pstmt.setString(5, board.getTitle());
			pstmt.setString(6, board.getContent());
			pstmt.setString(7, board.getPw());
			pstmt.setInt(8, idx);
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}

	// 파일업로드 글쓰기 insert
	public int setBoardFileWrite(BoardFileDto board) {
		int ri = 0;

		// idx 값 가져오기
		int idx = getIdx();

		String sql = "insert into board(idx, name, email, homepage, title, content, pw, `group`,filename) ";
		sql = sql + " values(?,?,?,?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getHomepage());
			pstmt.setString(5, board.getTitle());
			pstmt.setString(6, board.getContent());
			pstmt.setString(7, board.getPw());
			pstmt.setInt(8, idx);
			pstmt.setString(9, board.getFilename());
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}

	// 글수정 update
	public int setBoardUpdate(BoardDto board, int idx) {
		int ri = 0;
		String sql = "update board set name=?, email=?, homepage=?, title=?, content=? ";
		sql = sql + " where idx=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getHomepage());
			pstmt.setString(4, board.getTitle());
			pstmt.setString(5, board.getContent());
			pstmt.setInt(6, idx);
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}

	// 글삭제 delete
	public int setBoardDelete(int idx) {
		int ri = 0;
		String sql = "delete from board where idx=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}


	// 글답변 reply
	public int setBoardReply(BoardDto board) {
		int ri = 0;

		// 답변 전 reply 리스트 변경
		setReply(board.getGroup(), board.getStep());

		// idx 값 가져오기
		int idx = getIdx();

		String sql = "insert into board(idx, name, email, homepage, title, content, pw, `group`, step, indent) ";
		sql = sql + " values(?,?,?,?,?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getHomepage());
			pstmt.setString(5, board.getTitle());
			pstmt.setString(6, board.getContent());
			pstmt.setString(7, board.getPw());
			pstmt.setInt(8, board.getGroup());
			pstmt.setInt(9, board.getStep()+1);
			pstmt.setInt(10, board.getIndent()+1);
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}

	// 답변 전 reply 리스트 변경
	public int setReply(int group, int step) {
		int ri = 0;
		String sql = "update board set step = step + 1 ";
		sql = sql + " where `group` = ? and step > ?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, group);
			pstmt.setInt(2, step);
			ri = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return ri;
	}

	// idx 값 가져오기 
	public int getIdx() {
		int idx = 0;
		String sql = "select max(idx)+1 as idx from board";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				idx = rs.getInt("idx");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return idx;
	}

	// 전체 게시물 값 가져오기 
	public int getCount() {
		int count = 0;
		String sql = "select count(idx) as count from board";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return count;
	}

	// 검색 전체 게시물 값 가져오기 
	public int getCount(String keyWord, String searchWord) {
		int count = 0;
		String sql = "select count(idx) as count from board where "+keyWord+" like ?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return count;
	}



}
