package com.bigdata.command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MLoginCommand implements MCommand {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		MembersDao dao = MembersDao.getInstance();
		MembersDto member = dao.login(id, pw);
		int isLogin = -1;
		
		HttpSession session = request.getSession();
		if(member != null) {
			session.setAttribute("name", member.getName());
			session.setAttribute("nickname", member.getNickname());
			session.setAttribute("id", member.getId());
			if(member.getId().equals("admin")){
				isLogin = 0;
			}else{
				isLogin = 1;
			}
		}
		request.setAttribute("isLogin", isLogin);
		//test
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
	}
}
