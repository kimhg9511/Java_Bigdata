<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("name") ==null){%>
<<jsp:forward page="login.jsp"></jsp:forward>
<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("name");
%>
<h1><%=id %>님 환영합니다.</h1>
<hr>
<h2>
<a href="logout.jsp">로그아웃</a> / <a href="modify.jsp">회원정보수정</a> / <a href="deletemem.jsp">회원탈퇴</a>
<jsp:include page="select.jsp"></jsp:include>
</h2>
</body>
</html>