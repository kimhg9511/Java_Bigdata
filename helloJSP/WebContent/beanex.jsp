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
<jsp:setProperty property="name" name="student" value="홍길동"/>
<jsp:setProperty property="age" name="student" value="16"/>
<jsp:setProperty property="grade" name="student" value="6"/>
<jsp:setProperty property="studentNum" name="student" value="7"/>
<a href="useobj_session.jsp">session use Object</a>
<%-- <jsp:forward page="useobj_request.jsp"></jsp:forward> --%>
</body>
</html>