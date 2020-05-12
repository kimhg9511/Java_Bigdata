<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 값 받기
	String id = request.getParameter("uid");
	String pw = request.getParameter("upw");
	String name = request.getParameter("uname");
	String nickname = request.getParameter("unickname");
	String email = request.getParameter("uemail");
	
	// Dto 작성 
	JoinDto dto = new JoinDto(id, pw, name, nickname, email);
	
	// db 연결 - Update 처리
	JoinDao dao = JoinDao.getInstance();
	int ri = dao.joinUpdate(dto);
%>	
<%if(ri == 1){ %>
<script>
	alert('update에 성공 했습니다.')
	location.href='join_update.jsp';
</script>
	
<%}else{ %>
<script>
	alert('update에 실패 했습니다.')
	history.back();
</script>
<%} %>









 