package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dto.BoardDto;

public class BIndexCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String sPageList = request.getParameter("page");
		if(sPageList == null || sPageList.equals("")) {
			sPageList = "5";
		}
//		System.out.println("pageList: " + sPageList);
		String pageNum = request.getParameter("pagenum");
		if(pageNum==null) {
			pageNum = "1";
		}
//		System.out.println("pageNum: " + pageNum);
		int pageList = Integer.parseInt(sPageList);
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage -1)*pageList;
		int endRow = pageList;
		
		// dao
		BoardDao dao = BoardDao.getInstance();
		ArrayList<BoardDto> boards = dao.getBoardPage(startRow, endRow);
		int count = dao.getCount("1","1");
		int pageCount = (int)Math.ceil((double)count/pageList);
		request.setAttribute("boards", boards);
		request.setAttribute("count", count);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("pageNum", currentPage);
		request.setAttribute("pageList", pageList);
	}
}
