<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="includeaction2.jsp">
	<jsp:param value="asdf" name="id"/>
	<jsp:param value="1234" name="pw"/>
</jsp:include>
</body>
</html>