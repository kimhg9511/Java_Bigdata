package com.bigdata.command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.dao.BoardDao;

public class BDeleteCommand implements BCommand{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int idx = Integer.parseInt(request.getParameter("idx"));
		String pw = request.getParameter("pw");
		BoardDao dao = BoardDao.getInstance();
		int isDelete = dao.deleteBoard(idx, pw);
		request.setAttribute("isDelete", isDelete);
		System.out.println(isDelete);
	}
}
