package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.command.member.MAdminCommand;
import com.bigdata.command.member.MCommand;
import com.bigdata.command.member.MDeleteCommand;
import com.bigdata.command.member.MJoinCommand;
import com.bigdata.command.member.MLoginCommand;
import com.bigdata.command.member.MUpdateCommand;
import com.bigdata.command.member.MUpdateOkCommand;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("*.member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("actionDo");
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String uri = request.getRequestURI();
		String[] uriArr = uri.split("/");
		String comm = uriArr[uriArr.length-1];
		System.out.println(comm);
		String viewPage = null;
		MCommand command = null;
		// uri
		// userlist
		if(comm.equals("list.member")) {
			command = new MAdminCommand();
			command.execute(request, response);
			viewPage = "/member.jsp";
		// login
		} else if(comm.equals("login.member")) {
			command = new MLoginCommand();
			command.execute(request, response);
			viewPage = "/login/loginOk.jsp";
		// join
		} else if(comm.equals("join.member")) {
			command = new MJoinCommand();
			command.execute(request, response);
			viewPage = "/join/joinOk.jsp";
		// update
		} else if(comm.equals("update.member")) {
			command = new MUpdateCommand();
			command.execute(request, response);
			viewPage = "/join/userupdate.jsp";
		// updateOk
		} else if(comm.equals("updateOk.member")) {
			command = new MUpdateOkCommand();
			command.execute(request, response);
			viewPage = "/join/userupdateOk.jsp";
		// delete
		} else if(comm.equals("delete.member")) {
			command = new MDeleteCommand();
			command.execute(request, response);
			viewPage = "/join/userdeleteOk.jsp";
		}
		if(viewPage == null) {
			viewPage = "index.board";
		}
		request.setAttribute("comm", comm);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
