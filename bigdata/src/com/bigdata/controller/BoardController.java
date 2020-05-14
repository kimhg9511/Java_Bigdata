package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.command.board.BCommand;
import com.bigdata.command.board.BDeleteCommand;
import com.bigdata.command.board.BIndexCommand;
import com.bigdata.command.board.BListCommand;
import com.bigdata.command.board.BReplyCommand;
import com.bigdata.command.board.BReplyOkCommand;
import com.bigdata.command.board.BSearchCommand;
import com.bigdata.command.board.BUpdateCommand;
import com.bigdata.command.board.BUpdateOkCommand;
import com.bigdata.command.board.BWriteCommand;


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
		//index.do
		if(comm.equals("index.do")) {
			command = new BIndexCommand();
			command.execute(request, response);
			viewPage = "/pindex.jsp";
		//admin.do
		}else if(comm.equals("search.do")) {
			command = new BSearchCommand();
			command.execute(request, response);
			viewPage = "/search.jsp";
		//write.do
		} else if(comm.equals("write.do")) {
			command = new BWriteCommand();
			command.execute(request, response);
			viewPage = "/board/writeOk.jsp";
		//list.do
		} else if(comm.equals("list.do")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "/board/list.jsp";
		//reply.do
		} else if(comm.equals("reply.do")) {
			command = new BReplyCommand();
			command.execute(request, response);
			viewPage = "/board/reply.jsp";
		//replyOk.do
		} else if(comm.equals("replyOk.do")) {
			command = new BReplyOkCommand();
			command.execute(request, response);
			viewPage = "/board/replyOk.jsp";
		//update.do
		} else if(comm.equals("update.do")) {
			command = new BUpdateCommand();
			command.execute(request, response);
			viewPage = "/board/update.jsp";
		//updateOk.do
		} else if(comm.equals("updateOk.do")) {
			command = new BUpdateOkCommand();
			command.execute(request, response);
			viewPage = "/board/updateOk.jsp";
		//delete.do
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
