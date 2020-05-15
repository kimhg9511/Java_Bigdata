<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>글 읽기</h1>
<div class="view">
	<table>
		<tr>
			<th>작성자</th>
			<td>${board.author }</td>
			<th>작성일</th>
			<td>${board.regdate }</td>
		</tr>
		<tr>
			<th>E-mail</th>
			<td>${board.email }</td>
			<th>홈페이지</th>
			<td>${board.homepage }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${board.title }</td>
		</tr>
		<tr class="contents">
			<td colspan="4"><textarea name="" id="" cols="30" rows="30"
					disabled>${board.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="4" class="tail">조회수 : ${board.hit }</td>
		</tr>
	</table>
	<div class="button tail">
		<input type="button" value="목록"
			onclick="location.href='index.board'"> <input type="button"
			value="수정" onclick="location.href='update.board?idx=${board.idx }'"> 
		<input type="button" value="답변" onclick="location.href='reply.board?idx=${board.idx }'">
		<c:url var="delete" value="/board/delete.jsp">
			<c:param name="idx" value="${board.idx}" />
		</c:url>
		<input type="button" value="삭제" onclick="location.href='${delete }'">
	</div>
</div>
