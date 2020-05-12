<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

String id=request.getParameter("uid");
String pw=request.getParameter("upw");

JoinDao dao = JoinDao.getInstance();
// 로그인 체크 JoinDto getMember() 
JoinDto member = dao.getMember(id);
if(pw.equals(member.getPw())){ // 로그인 성공
	// 세션 생성
	session.setAttribute("id", id);
	session.setAttribute("name", member.getName());
	
	// 메인 페이지로 이동
	response.sendRedirect("/bigdata/main.jsp");
}else{ // 로그인 실패
%>
<script>
	alert("로그인에 실패했습니다.");
	history.back();
</script>
<%
}
%>    