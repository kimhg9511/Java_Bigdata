package com.bigdata.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BReplyOkCommand implements BCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Integer idx = Integer.parseInt(request.getParameter("idx"));
		String author = request.getParameter("author");
		String email = request.getParameter("email");
		String homepage = request.getParameter("homepage");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String pw = request.getParameter("pw");

		BoardDto board = new BoardDto(idx, author, email, homepage, title, content, pw);
		
		BoardDao dao = BoardDao.getInstance();
		int isInsert = dao.replyBoard(board);
		
		request.setAttribute("isInsert", isInsert);
	}

}
