<%@page import="bigdata.MembersDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>
<%
String id = request.getParameter("uid");
String pw = request.getParameter("upw");
MembersDao dao = MembersDao.getInstance();
String[] name = dao.membersLogin(id, pw);
if(name ==null){
%>
<script>
	alert("회원정보가 일치하지 않습니다.");
	location.href = "/bigdata/login/login.jsp";
</script>
<%
}else{
	session.setAttribute("name", name[0]);
	session.setAttribute("nick", name[1]);
	session.setAttribute("userId", id);
	response.sendRedirect("/bigdata/index0.jsp");
}
%>
</body>
</html>