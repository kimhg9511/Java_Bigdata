<%@page import="member.MemberDto"%>
<%@page import="member.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
request.setCharacterEncoding("UTF-8");
String name = (String)session.getAttribute("name");
if(name == null){%>
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
	// getMember();
	String id = (String)session.getAttribute("id");
	MemberDao dao = MemberDao.getInstance();
	MemberDto member = dao.getMember(id);
%>
<h1>회원정보수정 : <%=name %>님</h1>
<form action="modifyOk.jsp" method="POST" name="updatefrm">
<input type="hidden" name="id" value="<%=(String)session.getAttribute("id")%>">
<table>
<tr><td>Name : </td>
<td colspan=2><input type="text" name="name" size="20" value="<%=member.getName()%>"></td></tr>
<tr><td>Mail : </td>
<td colspan=2><input type="text" name="email" size="20" value="<%=member.getEmail()%>"></td></tr>
<tr><td>Address : </td>
<td colspan=2><input type="text" name="address" size="20" value="<%=member.getAddress()%>"></td></tr>
<tr><td>PW : </td>
<td colspan=2><input type="password" name="pw" size="20"></td></tr>
<tr><td><input type="submit" value="수정"></td>
<td><input type="reset" value="재입력"></td></tr>
</table>

</form>
</body>
</html>