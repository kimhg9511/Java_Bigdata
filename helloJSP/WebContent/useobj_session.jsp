<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.javalec.ex.Student" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="name" name="student"/>
<jsp:getProperty property="age" name="student"/>
<jsp:getProperty property="grade" name="student"/>
<jsp:getProperty property="studentNum" name="student"/>
</body>
</html>