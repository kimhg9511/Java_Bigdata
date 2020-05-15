<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="delete.board" method="post" name="form">
<input type="text" name="idx" value="${param.idx }">
<div class="delete center">
	<h1>작성자의 비밀번호를 입력해주세요</h1>
	<input id="upw" type="password" name="pw">
	<div class="button del">
		<input type="button" id="delete" value="삭제완료"> <input
			type="button" value="뒤로" onclick="javascript:history.back()">
	</div>
	<%-- footer --%>
	<%@ include file="/layout/footer.jsp"%>
	<%-- footer end. --%>
</div>
</form>