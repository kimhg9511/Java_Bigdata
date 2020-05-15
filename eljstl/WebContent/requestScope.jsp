<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestScope.jsp</title>
</head>
<body>
<h1>
<!-- scope -->
applicationScope: ${applicationScope.application_name }<br><!-- view other browser -->
sessionScope: ${sessionScope.session_name }<br>
pageScope: ${pageScope.pageCon_name }<br><!-- invalid -->
requestScope: ${requestScope.request_name }
</h1>
</body>
</html>