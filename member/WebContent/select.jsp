<%@page import="java.util.ArrayList"%>
<%@page import="member.MemberDao"%>
<%@page import="member.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = (String)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Actor Table</h1>
<%if(name != null){ %>
<%=name %>님
<%} %>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Password</th>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
		<th>Regdate</th>
	</tr>
<%
MemberDao dao = MemberDao.getInstance();
ArrayList<MemberDto> members = dao.memberSelect(10);
for(MemberDto member: members){
%>
	<tr>
		<td><%=member.getId()%></td>
		<td><%=member.getPw()%></td>
		<td><%=member.getName()%></td>
		<td><%=member.getEmail()%></td>
		<td><%=member.getAddress()%></td>
		<td><%=member.getRegdate()%></td>
	</tr>		
<%
}
%>
</table>
<h1><a href="join.jsp">회원가입</a> / <a href="login.jsp">로그인</a></h1>
</body>
</html>