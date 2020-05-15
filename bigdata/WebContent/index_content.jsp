<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cnt" value="${count - pageList * (pageNum - 1)}" />
<!DOCTYPE html>
<div id="content-wrap">
	<div class="boardconfig">
		<form action="search.board" method="get" name="form" class="form">
			<div class="search">
				<select name="search" class="search">
					<option value="title">제목</option>
					<option value="author">작성자</option>
				</select> (으)로 검색: <input type="text" name="isearch" class="isearch">
				<input type="submit" value="검색">
			</div>
		</form>
		<form action="index.board" method="get" name="form2" class="form">
			<div class="page">
				<select id="page" name="page" class="page" onchange="setPageSize()">
					<option value="" selected></option>
					<option id="five" value="5">5</option>
					<option id="ten" value="10">10</option>
					<option id="fifteen" value="15">15</option>
				</select> 개씩 보기
			</div>
		</form>
	</div>
	<div id="table">
		<table>
			<tr>
				<th>번 호</th>
				<th class="table-contents">제 목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조 회</th>
			</tr>
			<c:forEach items="${boards }" var="board">
				<tr>
					<td>${cnt }</td>
					<td class="table-contents">
						<c:url var="list" value="/board/list.board">
							<c:param name="idx" value="${board.idx }"></c:param>
						</c:url> 
						<a href="${list}">${board.title }</a>
					</td>
					<td>${board.author }</td>
					<td>${board.regdate }</td>
					<td>${board.hit }</td>
				</tr>
			<c:set var="cnt" value="${cnt-1 }"></c:set>
			</c:forEach>
				<tr>
					<th colspan="5">
						<c:forEach var="i" begin="1" end="${pageCount }" step="1">
							<c:url var="page" value="/index.board">
								<c:param name="pagenum" value="${i }"></c:param>
								<c:param name="page" value="${pageList }"></c:param>
							</c:url>
							<a href="${page}">${i }</a>
						</c:forEach>
					</th>
				</tr>
		</table>
		<div class="button">

			<input type="button" value="글쓰기"
				onclick="location.href = '/bigdata/board/write.jsp'">
		</div>
	</div>
</div>
<script>
	function setPageSize() {
		document.form2.submit();
	}
</script>