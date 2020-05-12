<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 넘어온 데이터 받기 => dao 보내기
request.setCharacterEncoding("UTF-8");
String sIdx = request.getParameter("idx");
int idx = Integer.parseInt(sIdx);
String name = request.getParameter("bname");
String email = request.getParameter("bemail");
String homepage = request.getParameter("bhomepage");
String title = request.getParameter("btitle");;
String content = request.getParameter("bcontent");
String pw = request.getParameter("bpw"); 
String sGroup = request.getParameter("group"); 
String sStep = request.getParameter("step"); 
String sIndent = request.getParameter("indent"); 
int group = Integer.parseInt(sGroup);
int step = Integer.parseInt(sStep);
int indent = Integer.parseInt(sIndent);
// 글 하나 생성
BoardDto board = new BoardDto(name, email, homepage, title, content, pw, group, step, indent);

//dao
BoardDao dao = BoardDao.getInstance();

// insert
int ri = dao.setBoardReply(board);
// 글 입력 처리 후 이동
%>
<script>
<%if(ri == 1) {%>
	alert('글답변 성공');
	location.href='<%=request.getContextPath()%>/board/list.jsp';
<%}else{ %>
	alert('글답변 실패');
	history.back(); // history.go(-1);
<%} %>
</script>







