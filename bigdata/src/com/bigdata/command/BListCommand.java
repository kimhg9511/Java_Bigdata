package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BListCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String sIdx = request.getParameter("idx");
		int idx = Integer.parseInt(sIdx);
		BoardDao dao = BoardDao.getInstance();
		BoardDto board = dao.getBoardOne(idx);
		int hit = dao.increaseHit(idx,board);
		
		request.setAttribute("board", board);
		request.setAttribute("hit", hit);
	}
}

