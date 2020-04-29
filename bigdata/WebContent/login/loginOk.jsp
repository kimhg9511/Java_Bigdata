<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
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
String id = request.getParameter("id");
String pw = request.getParameter("password");
MembersDao dao = MembersDao.getInstance();
MembersDto member = dao.login(id, pw);
if(member == null){
%>
<script>
	alert("회원정보가 일치하지 않습니다.");
	location.href = "/bigdata/login/login.jsp";
</script>
<%
}else{
	session.setAttribute("name", member.getName());
	session.setAttribute("nickname", member.getNickname());
	session.setAttribute("id", member.getId());
	if(member.getId().equals("admin")){
		response.sendRedirect("/bigdata/admin0.jsp");
	}else{
		response.sendRedirect("/bigdata/index0.jsp");	
	}
}
%>
</body>
</html>