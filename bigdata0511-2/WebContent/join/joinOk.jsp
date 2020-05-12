<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 값 받기
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("uid");
	String pw = request.getParameter("upw");
	String name = request.getParameter("uname");
	String nickname = request.getParameter("unickname");
	String email = request.getParameter("uemail");
	
	// db 연결
	JoinDao dao = JoinDao.getInstance();
	
	// 중복 id 체크 
	JoinDto member =  dao.getMember(id);
	if(member == null) { // 중복 id 없다면
		// 회원가입 처리
		// 가입 정보 생성
		member = new JoinDto(id, pw, name, nickname, email);
		int ri = dao.joinInsert(member);
		
		if(ri == 1){ // 가입 성공
			response.sendRedirect("/bigdata/login/login.jsp");		
		}else{ // 가입 실패
			
%>			
<script>
	alert("회원가입에 실패 했습니다.");
	history.back();
</script>
<%			
		}
	
	}else { // 중복 id 있다면
%>
<script>
	alert("중복된 ID 입니다.");
	history.back();
</script>
<%	} %>	
	
	
	
	
	
	
	
	
	
 