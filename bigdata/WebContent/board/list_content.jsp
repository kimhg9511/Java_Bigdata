<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>글 읽기</h1>
<div class="view">
	<table>
		<tr>
			<th>작성자</th>
			<td>김현겸</td>
			<th>작성일</th>
			<td>2020/04/16</td>
		</tr>
		<tr>
			<th>E-mail</th>
			<td>kimhg@com</td>
			<th>홈페이지</th>
			<td>kimhg@com</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">게시판 글입니다.</td>
		</tr>
		<tr class="contents">
			<td colspan="4"><textarea name="" id="" cols="30" rows="30"
					disabled>게시글</textarea></td>
		</tr>
		<tr>
			<td colspan="4" class="tail">조회수 : 10</td>
		</tr>
	</table>
	<div class="button tail">
		<input type="button" value="목록"
			onclick="location.href='../index1.jsp'"> <input type="button"
			value="수정" onclick="location.href='update.jsp'"> <input
			type="button" value="답변" onclick="location.href='update.jsp'">
		<input type="button" value="삭제" onclick="location.href='delete.jsp'">
	</div>
</div>
