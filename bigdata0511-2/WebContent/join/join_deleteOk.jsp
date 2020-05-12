<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	// 값 받기
	String id = request.getParameter("uid");
	String pw = request.getParameter("upw");
	
	// Dto 작성 - 파라메타가 id, pw 2개이므로 그냥 전달 
	
	int ri = 0;
	// db 연결 : 1 - pw확인 , 2 - Update 처리
	JoinDao dao = JoinDao.getInstance();
	// 1 - pw확인
	JoinDto dto = dao.getMember(id);
	if(dto != null){ 
		if(dto.getPw().equals(pw)){ // pw 맞으면
			ri = dao.joinDelete(id); // delete
			session.invalidate(); // 세션 제거
		}
	}
%>	
<%if(ri == 1){ %>
<script>
	alert('update에 성공 했습니다.')
	location.href='join.jsp';
</script>
	
<%}else{ %>
<script>
	alert('update에 실패 했습니다.')
	history.back();
</script>
<%} %>









 