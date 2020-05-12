package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.command.BAdminCommand;
import com.bigdata.command.BCommand;
import com.bigdata.command.BDeleteCommand;
import com.bigdata.command.BIndexCommand;
import com.bigdata.command.BListCommand;
import com.bigdata.command.BSearchCommand;


@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("actionDo");
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
		BCommand command = null;
		
		if(comm.equals("index.do")) {
			command = new BIndexCommand();
			command.execute(request, response);
			viewPage = "/pindex.jsp";
		} else if(comm.equals("admin.do")) {
			command = new BAdminCommand();
			command.execute(request, response);
			viewPage = "/admin0.jsp";
		} else if(comm.equals("list.do")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "/board/list.jsp";
		} else if(comm.equals("search.do")) {
			command = new BSearchCommand();
			command.execute(request, response);
			viewPage = "/pindex.jsp";
		} else if(comm.equals("delete.do")) {
			command = new BDeleteCommand();
			command.execute(request, response);	
			viewPage = "/board/deleteOk.jsp";
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
