<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="write form">
	<h1>게시판 글 수정하기</h1>
	<h2>작 성 자</h2>
	<input id="writer" type="text" value="작성자 기본값"><br>
	<h2>E-mail</h2>
	<input id="mail" type="text" value="mail 기본값"><br>
	<h2>홈페이지</h2>
	<input id="homep" type="text" value="홈페이지 기본값"><br>
	<h2>제 목</h2>
	<input id="btitle" type="text" value="제목 기본값"><br>
	<h2>내 용</h2>
	<textarea name="" id="bcontent" cols="30" rows="20" placeholder="내용 기본값"></textarea>
	<br>
	<div class="tail">
	<h2>비밀번호</h2>
	<input id="upw" type="password">
	</div>
	<div class="button">
		<input type="button" id="update" value="수정"> <input type="button"
			id="reset" value="다시 수정"> <input type="button" value="뒤로"
			onclick="location.href='../index0.jsp'">
	</div>
</div>
