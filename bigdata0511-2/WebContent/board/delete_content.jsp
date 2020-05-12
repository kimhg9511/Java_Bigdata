<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String idx = request.getParameter("idx"); 
%> 	
<h1 class="content-title">글 삭제하기</h1>
<div id="board-wrap">
	<form action="<%=request.getContextPath() %>/board/deleteOk.jsp" method="post">
		<input type="text" name="idx" value="<%=idx%>">
		<table class="pos">
			<tr>
				<td><strong>작성자의 비밀번호를 입력해 주세요</strong></td>
			</tr>
			<tr>
				<td><input type="password" name="bpw" id="bpw"></td>
			</tr>
		</table>

		<div class="btnwrap">
			<div class="btn" id="deleteBtn">삭제 완료</div>
			<a href="javascript:history.back();" class="btn white">뒤로</a>
		</div>
	</form>
</div>