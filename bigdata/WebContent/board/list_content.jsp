<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String idx = request.getParameter("idx");
BoardDto board = (BoardDto)request.getAttribute("board");
int hit = (int)request.getAttribute("hit");
%>
<h1>글 읽기</h1>
<div class="view">
	<table>
		<tr>
			<th>작성자</th>
			<td><%=board.getAuthor() %></td>
			<th>작성일</th>
			<td><%=board.getRegdate() %></td>
		</tr>
		<tr>
			<th>E-mail</th>
			<td><%=board.getEmail() %></td>
			<th>홈페이지</th>
			<td><%=board.getHomepage() %></td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"><%=board.getTitle() %></td>
		</tr>
		<tr class="contents">
			<td colspan="4"><textarea name="" id="" cols="30" rows="30"
					disabled><%=board.getContent() %></textarea></td>
		</tr>
		<tr>
			<td colspan="4" class="tail">조회수 : <%=hit %></td>
		</tr>
	</table>
	<div class="button tail">
		<input type="button" value="목록"
			onclick="location.href='../index0.jsp'"> <input type="button"
			value="수정" onclick="location.href='update.jsp?idx=<%=idx %>'"> 
		<input type="button" value="답변" onclick="location.href='reply.jsp?idx=<%=idx%>'">
		<input type="button" value="삭제" onclick="location.href='delete.jsp?idx=<%=idx%>'">
	</div>
</div>
