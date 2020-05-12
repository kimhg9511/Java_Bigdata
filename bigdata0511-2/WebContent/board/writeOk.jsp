<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 넘어온 데이터 받기 => dao 보내기
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("bname");
String email = request.getParameter("bemail");;
String homepage = request.getParameter("bhomepage");;
String title = request.getParameter("btitle");;
String content = request.getParameter("bcontent");;
String pw = request.getParameter("bpw");; 
// 글 하나 생성
BoardDto board = new BoardDto(name, email, homepage, title, content, pw);

//dao
BoardDao dao = BoardDao.getInstance();

// insert
int ri = dao.setBoardWrite(board);

// 글 입력 처리 후 이동
%>
<script>
<%if(ri == 1) {%>
	alert('글쓰기 성공');
	location.href='<%=request.getContextPath()%>/board/list.jsp';
<%}else{ %>
	alert('글쓰기 실패');
	history.back(); // history.go(-1);
<%} %>
</script>







