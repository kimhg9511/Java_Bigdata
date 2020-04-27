<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="write form">
	<h1>게시판 글쓰기</h1>
	<h2>작성자</h2>
	<input id="writer" type="text"><br>
	<h2>E-mail</h2>
	<input id="mail" type="text"><br>
	<h2>홈페이지</h2>
	<input id="homep" type="text"><br>
	<h2>제목</h2>
	<input id="btitle" type="text"><br>
	<h2>내용</h2>
	<textarea name="" id="bcontent" cols="30" rows="20"></textarea>
	<br>
	<div class="tail">
		<h2>비밀번호</h2>
		<input type="password" id="upw"><br>
	</div>
</div>
<div class="button">
	<input type="button" id="regist" value="등록"> <input
		type="button" value="뒤로" onclick="location.href='../index0.jsp'">
</div>