<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String receive = null;
	if(request.getParameter("data2")!=null){
		receive = request.getParameter("data2") + request.getParameter("data");
	}else{
		receive = request.getParameter("data");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>send02</title>
</head>
<body>
<form action="send03.jsp" method="POST">
	<h1><%=receive %></h1>
	<hr>
	<input type="hidden" value=<%=receive %> name="data2">
	<input type="text" value="" name="data">
	<input type="submit" value="전달">
</form>
</body>
</html>