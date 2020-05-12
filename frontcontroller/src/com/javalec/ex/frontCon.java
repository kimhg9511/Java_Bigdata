package com.javalec.ex;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class frontController
 */
@WebServlet("*.do")
public class frontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public frontCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet");
    	actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost");
    	actionDo(request,response);
	}


	private void actionDo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("actionDo");
		String uri = request.getRequestURI();	// command
		String[] uriArr = uri.split("/");
		String command = uriArr[uriArr.length-1];
		
		if(command.equals("insert.do")) {
			System.out.println("insert");
		} else if(command.equals("select.do")) {
			System.out.println("select");
		} else if(command.equals("delete.do")) {
			System.out.println("delete");
		} else if(command.equals("update.do")) {
			System.out.println("update");
		}
	}
}
