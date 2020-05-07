<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="delete center">
	<h1>비밀번호를 입력해주세요</h1>
	<form action="userdeleteOk.jsp" method="POST" name="del_form">
	<input id="upw" type="password" name="password">
	<div class="button del">
		<input type="button" id="userdelete" value="삭제완료"> <input
			type="button" value="뒤로" onclick="location.href='list.jsp'">
	</div>
	</form>
	<%-- footer --%>
	<%@ include file="/layout/footer.jsp"%>
	<%-- footer end. --%>
</div>
