package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInitParam
 */
@WebServlet(urlPatterns = { "/ServletInitParam" }, initParams = { @WebInitParam(name = "id", value = "kimhg_anno"),
		@WebInitParam(name = "pw", value = "1234"), @WebInitParam(name = "path", value = "D:/bigdata/Java_Bigdata") })
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInitParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Do GET");
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String path = getInitParameter("path");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter write = response.getWriter();
		write.println("ID: " + id + "<br>");
		write.println("Password: " + pw + "<br>");
		write.println("Path: " + path + "<br>");
		write.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Do POST");
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String path = getInitParameter("path");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter write = response.getWriter();
		write.println("ID: " + id + "<br>");
		write.println("Password: " + pw + "<br>");
		write.println("Path: " + path + "<br>");
		write.close();
	}

}
