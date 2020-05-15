<%@page import="com.eljstl.ex.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- scriptlet
MemberDto member = new MemberDto();
member.setId("hong");
member.setPw("1234");
member.setName("홍길동");
--%>
<%-- action tag --%>
<jsp:useBean id="member" class="com.eljstl.ex.MemberDto" />
<jsp:setProperty property="id" value="hong" name="member" />
<jsp:setProperty property="pw" value="1234" name="member" />
<jsp:setProperty property="name" value="홍길동" name="member" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_member.jsp</title>
</head>
<body>
<h1>
<!-- legacy -->
ID: <jsp:getProperty property="id" name="member"/><br>
PW: <jsp:getProperty property="pw" name="member"/><br>
NAME: <jsp:getProperty property="name" name="member"/><br>
<!-- el -->
<hr>
ID: ${member.id }<br>
PW: ${member.pw }<br>
NAME: ${member.name }<br>
</h1>
</body>
</html>