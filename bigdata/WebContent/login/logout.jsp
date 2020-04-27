<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.setAttribute("nick", null);
session.setAttribute("userId",null);
%>
<script>
alert("로그아웃 되었습니다.")
location.href ="/bigdata/index0.jsp";
</script>