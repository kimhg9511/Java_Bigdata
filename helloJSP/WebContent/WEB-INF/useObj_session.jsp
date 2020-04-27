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
<jsp:getProperty property="name" name="student" value="홍길동"/>
<jsp:getProperty property="age" name="student" value="16"/>
<jsp:getProperty property="grade" name="student" value="6"/>
<jsp:getProperty property="studentNum" name="student" value="7"/>
</body>
</html>