package com.bigdata.command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MUpdateOkCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int isUpdate = -1;
		
		MembersDto member = new MembersDto(id, password, nickname, name, email);
		MembersDao dao = MembersDao.getInstance();
		isUpdate = dao.updateMember(member);
		
		request.setAttribute("isUpdate", isUpdate);
	}
}


