package com.bigdata.command.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.dao.MembersDao;
import com.bigdata.dto.MembersDto;

public class MAdminCommand implements MCommand {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MembersDao dao = MembersDao.getInstance();
		ArrayList<MembersDto> members = dao.selectAll();
		request.setAttribute("members", members);
	}
}
