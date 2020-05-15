<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_scope.jsp</title>
</head>
<body>
<form action="el_scopeOk.jsp" method="post">
<h1>
ID: <input type="text" name="id"><br>
PW: <input type="text" name="pw"><br>
<input type="submit" value="login">
</h1>
</form>
<hr>
<%
	application.setAttribute("application_name", "application_value");
	session.setAttribute("session_name", "session_value");
	pageContext.setAttribute("pageCon_name", "pageCon_value");
	request.setAttribute("request_name", "request_value");
%>
<jsp:forward page="requestScope.jsp" />
</body>
</html>