package com.bigdata.command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MUpdateCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		MembersDao dao = MembersDao.getInstance();
		MembersDto member = dao.selectOne(id);
		
		request.setAttribute("member", member);
	}

}
