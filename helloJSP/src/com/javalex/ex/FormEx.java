package com.javalex.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("******POST Request..******");
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		String speak = request.getParameter("speak");
		
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("password : " + password);	
		System.out.println("hobbys : " + Arrays.toString(hobby));
		System.out.println("major : " + major);
		System.out.println("protocol : " + protocol);
		System.out.println("speak : " + speak);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>Form Data Submit</title></head>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("name : " + name+ "<br>");
		writer.println("id : " + id + "<br>");
		writer.println("password : " + password + "<br>");	
		writer.println("hobbys : " + Arrays.toString(hobby) + "<br>");
		writer.println("major : " + major + "<br>");
		writer.println("protocol : " + protocol + "<br>");
		writer.println("speak : " + speak + "<br>");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
