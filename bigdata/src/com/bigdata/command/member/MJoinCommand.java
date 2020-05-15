package com.bigdata.command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MJoinCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int isJoin = -1;
		
		MembersDto member = new MembersDto(id, password, nickname, name, email);
		MembersDao dao = MembersDao.getInstance();
		MembersDto checkId = dao.selectOne(member.getId());
		
		if(checkId != null) {
			isJoin = 0;
		} else {
			int isCreate = dao.createMember(member);
			if(isCreate != 0) {
				isJoin = 1;
			}
		}
		
		request.setAttribute("isJoin", isJoin);
	}

}
