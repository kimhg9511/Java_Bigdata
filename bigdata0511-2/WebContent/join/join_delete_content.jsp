<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//회원정보 수정할 데이터 가저오기
String id = (String)session.getAttribute("id");
%>	
<h1 class="content-title">회원 탈퇴하기</h1>
<div id="board-wrap">
	<form action="<%=request.getContextPath() %>/join/join_deleteOk.jsp" method="post">
		<input type="hidden" name="uid" value="<%=id %>">
		<table class="pos">
			<tr>
				<td><strong>비밀번호를 입력해 주세요</strong></td>
			</tr>
			<tr>
				<td><input type="password" name="upw" id="upw"></td>
			</tr>
		</table>

		<div class="btnwrap">
			<div class="btn" id="deleteBtn">삭제 완료</div>
			<a href="javascript:history.back();" class="btn white">뒤로</a>
		</div>
	</form>
</div>