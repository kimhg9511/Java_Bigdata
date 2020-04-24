<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//id: asdf pw:1234
String id=request.getParameter("id");
String pw=request.getParameter("pw");
if(id.equals("asdf")&&pw.equals("1234")){
	session.setAttribute("id", id);
	response.sendRedirect("welcome.jsp");
}else{
	response.sendRedirect("login.jsp");
}
%>