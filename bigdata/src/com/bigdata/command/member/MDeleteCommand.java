package com.bigdata.command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MDeleteCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String password = request.getParameter("password");
		MembersDao dao = MembersDao.getInstance();
		MembersDto member = dao.login(id, password);
		int isDelete = -1;
		
		if(member != null) {
			int isDeleteGood = dao.deleteMember(id, password);
			if(isDeleteGood == 0) {
				isDelete =0;
			} else {
				session.invalidate();
				isDelete = 1;
			}
		}
		request.setAttribute("isDelete", isDelete);
	}

}
