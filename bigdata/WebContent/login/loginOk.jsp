<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("uid");
String pw = request.getParameter("upw");
if(id.equals("asdf")&&pw.equals("1234")){
	session.setAttribute("name", "홍길동");
	response.sendRedirect("/bigdata/index1.jsp");
}else{
	response.sendRedirect("/bigdata/login/login.jsp");
}
%>