package com.bigdata.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BUpdateOkCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Integer idx = Integer.parseInt(request.getParameter("idx"));
		String email = request.getParameter("email");
		String homepage = request.getParameter("homepage");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String pw = request.getParameter("pw");

		BoardDto board = new BoardDto(idx, email, homepage, title, content, pw);
		BoardDao dao = BoardDao.getInstance();
		int isUpdate = dao.updateBoard(board);
		
		request.setAttribute("idx", idx);
		request.setAttribute("isUpdate", isUpdate);
	}
}
