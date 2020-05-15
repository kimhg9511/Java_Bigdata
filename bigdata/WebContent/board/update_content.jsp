<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form action="updateOk.board" method="post" name="form">
<div class="write form">
	<h1>게시판 글 수정하기</h1>
	<input type="hidden" name="idx" value="${param.idx }"> 
	<h2>작 성 자</h2>
	<input id="writer" type="text" value="${board.author }" name="author" ><br>
	<h2>E-mail</h2>
	<input id="mail" type="text" value="${board.email }" name="email"><br>
	<h2>홈페이지</h2>
	<input id="homep" type="text" value="${board.homepage }" name="homepage"><br>
	<h2>제 목</h2>
	<input id="btitle" type="text" value="${board.title }" name="title"><br>
	<h2>내 용</h2>
	<textarea id="bcontent" cols="30" rows="20" placeholder="내용 기본값" name="content">${board.content }</textarea>
	<br>
	<div class="tail">
	<h2>비밀번호</h2>
	<input id="upw" type="password" name="pw">
	</div>
	<div class="button">
		<input type="button" id="update" value="수정"> <input type="button"
			id="reset" value="다시 수정"> <input type="button" value="뒤로"
			onclick="javascript:history.back()">
	</div>
</div>
</form>