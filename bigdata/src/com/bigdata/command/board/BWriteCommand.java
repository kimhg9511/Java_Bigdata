package com.bigdata.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BWriteCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String author = request.getParameter("author");
		String email = request.getParameter("email");
		String homepage = request.getParameter("homepage");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String pw = request.getParameter("pw");

		BoardDto board = new BoardDto(author, email, homepage, title, content, pw);
		BoardDao dao = BoardDao.getInstance();
		int isInsert = dao.insertBoard(board);
		int max = dao.getMaxIdx();
		if(isInsert !=0) {
			dao.updateGroup(max);
		}
		request.setAttribute("isInsert", isInsert);
	}
}
