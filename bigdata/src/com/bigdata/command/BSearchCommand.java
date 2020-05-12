package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BSearchCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String sPageList = request.getParameter("page");
		if(sPageList == null || sPageList.equals("")) {
			sPageList = "5";
		}
		System.out.println(sPageList);
		String pageNum = request.getParameter("pagenum");
		if(pageNum==null) {
			pageNum = "1";
		}
		int pageList = Integer.parseInt(sPageList);
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage -1)*pageList;
		int endRow = pageList;
		String condition = request.getParameter("search");
		String value = request.getParameter("isearch");
		
		// dao
		BoardDao dao = BoardDao.getInstance();
		ArrayList<BoardDto> boards = dao.getBoardSearch(startRow, endRow, condition, value);
		int count = dao.getCount(condition, value);
		int pageCount = (int)Math.ceil((double)count/pageList);

		request.setAttribute("boards", boards);
		request.setAttribute("count", count);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("pageNum", currentPage);

	}
}
