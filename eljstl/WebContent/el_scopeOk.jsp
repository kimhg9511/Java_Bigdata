<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_scopeOk.jsp</title>
</head>
<body>
<h1>
<!-- scriptlet -->
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
ID: <%=id %> / PW: <%=pw %>
<hr>
<!-- el -->
ID: ${param.id } / PW: ${param.pw }
<hr>
<!-- scope -->
applicationScope: ${applicationScope.application_name }<br><!-- view other browser -->
sessionScope: ${sessionScope.session_name }<br>
pageScope: ${pageScope.pageCon_name }<br><!-- invalid -->
requestScope: ${requestScope.request_name }
</h1>
</body>
</html>