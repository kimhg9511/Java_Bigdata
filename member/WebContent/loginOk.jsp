<%@page import="member.MemberDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//id: asdf pw:1234
request.setCharacterEncoding("UTF-8");
String id=request.getParameter("id");
String pw=request.getParameter("pw");

MemberDao dao = MemberDao.getInstance();
String login = null;
login = dao.memberLogin(id, pw);		
if(login == null){
%>
<script>
		alert("로그인 실패");
		location.href = 'login.jsp';
</script>

<%
}else{
	session.setAttribute("name", login);
	session.setAttribute("id", id);
	response.sendRedirect("main.jsp");
}
%>
