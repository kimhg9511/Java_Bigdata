package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.BoardDao;
import com.bigdata.dao.MembersDao;
import com.bigdata.dto.BoardDto;
import com.bigdata.dto.MembersDto;

public class BAdminCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {		
		// dao
		MembersDao dao = MembersDao.getInstance();
		ArrayList<MembersDto> members = dao.selectAll();
		
		request.setAttribute("members", members);
	}
}
