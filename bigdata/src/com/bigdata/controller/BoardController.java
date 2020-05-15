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


@WebServlet("*.board")
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
		//index.board
		if(comm.equals("index.board") || comm.equals("bigdata")) {
			command = new BIndexCommand();
			command.execute(request, response);
			viewPage = "/index.jsp";
		//admin.board
		}else if(comm.equals("search.board")) {
			command = new BSearchCommand();
			command.execute(request, response);
			viewPage = "/search.jsp";
		//write.board
		} else if(comm.equals("write.board")) {
			command = new BWriteCommand();
			command.execute(request, response);
			viewPage = "/board/writeOk.jsp";
		//list.board
		} else if(comm.equals("list.board")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "/board/list.jsp";
		//reply.board
		} else if(comm.equals("reply.board")) {
			command = new BReplyCommand();
			command.execute(request, response);
			viewPage = "/board/reply.jsp";
		//replyOk.board
		} else if(comm.equals("replyOk.board")) {
			command = new BReplyOkCommand();
			command.execute(request, response);
			viewPage = "/board/replyOk.jsp";
		//update.board
		} else if(comm.equals("update.board")) {
			command = new BUpdateCommand();
			command.execute(request, response);
			viewPage = "/board/update.jsp";
		//updateOk.board
		} else if(comm.equals("updateOk.board")) {
			command = new BUpdateOkCommand();
			command.execute(request, response);
			viewPage = "/board/updateOk.jsp";
		//delete.board
		} else if(comm.equals("delete.board")) {
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
