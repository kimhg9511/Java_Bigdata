<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));
BoardDao dao = BoardDao.getInstance();
BoardDto board = dao.getBoardOne(idx);

%>
<form action="replyOk.jsp" method="post" name="form">
	<div class="write form">
		<h1>게시판 답변하기</h1>
		<h2>작성자</h2>
		<input type="hidden" value="<%=idx%>" name="idx">
		<input id="writer" type="text" name="author"><br>
		<h2>E-mail</h2>
		<input id="mail" type="text" name="email"><br>
		<h2>홈페이지</h2>
		<input id="homep" type="text" name="homepage"><br>
		<h2>제목</h2>
		<input id="btitle" type="text" name="showtitle" value="Re:<%=board.getTitle()%>" disabled><br>
		<input type="hidden" name="title" value="Re:<%=board.getTitle()%>">
		<h2>내용</h2>
		<textarea id="bcontent" cols="30" rows="10" name="content"></textarea>
		<textarea id="bcontent" cols="30" rows="10" name="content2" disabled><%=board.getContent()%></textarea>
		<br>
		<div class="tail">
			<h2>비밀번호</h2>
			<input type="password" id="upw" name="pw"><br>
		</div>
	</div>
	<div class="button">
		<input type="button" id="reply" value="답변" onclick="javascript:submit()"> 
		<input type="button" value="뒤로" onclick="javascript:history.back()">
	</div>
</form>