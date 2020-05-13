package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BUpdateCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDao dao = BoardDao.getInstance();
		BoardDto board = dao.getBoardOne(idx);
		
		request.setAttribute("board", board);
		request.setAttribute("idx", idx);
	}

}
