<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el.jsp</title>
</head>
<body>
<h1>
<!-- jsp scriptlet -->
<%=10 %><br>
<%=99.99 %><br>
<%="ABC" %><br>
<%=true %><br>
<hr>
<!-- el -->
${10 }<br>
${99.99 }<br>
${"ABC" }<br>
${true }<br>
<hr>
${1+2 }<br>		<!-- 3 -->
${1>2 }<br>		<!-- false -->
${1>2 ? "삼항" : "연산" }<br>		<!-- 연산 -->
${1>2 ? "삼항" : "연산" }<br>		<!-- 연산 -->
</h1>
</body>
</html>