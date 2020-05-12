<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1 class="content-title">게시판 글쓰기</h1>
<div id="board-wrap">
	<form action="<%=request.getContextPath() %>/board/writeOk.jsp" method="post">
		<table class="pos">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bname" id="bname" value=""></td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td><input type="text" name="bemail" id="bemail" value=""></td>
			</tr>
			<tr>
				<td>홈페이지</td>
				<td><input type="text" name="bhomepage" id="bhomepage" value=""></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="btitle" id="btitle" value=""></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bcontent" id="bcontent" cols="30" rows="10"></textarea></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="bpw" id="bpw" value=""></td>
			</tr>
		</table>

		<div class="btnwrap">
			<div class="btn" id="writeBtn">등록</div>
			<a href="javascript:history.back();" class="btn white">뒤로</a>
		</div>
	</form>
</div>