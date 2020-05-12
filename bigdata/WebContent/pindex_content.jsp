<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String nickname = (String) session.getAttribute("nickname");
ArrayList<BoardDto> boards = (ArrayList<BoardDto>) request.getAttribute("boards");
int count = (int) request.getAttribute("count");
int pageCount = (int) request.getAttribute("pageCount");
int pageNum = (int) request.getAttribute("pageNum");
String redirect = (String)request.getAttribute("comm");
String redirect2 = "";
if(redirect.equals("search.do")){
	redirect2 = "&search="+ request.getParameter("search") + "&isearch=" + request.getParameter("isearch");
}
if(redirect.equals("delete.do")){
	redirect= "index.do";
}
%>
<!DOCTYPE html>
<div id="content-wrap">
	<form action="search.do" method="get" name="form" class="form">
		<div class="boardconfig">
			<div class="search">
				<select name="search" class="search">
					<option value="title">제목</option>
					<option value="author">작성자</option>
				</select> (으)로 검색: <input type="text" name="isearch" class="isearch">
				<input type="submit" value="검색">
			</div>
			<div class="page">
				<select id="page" name="page" class="page" onchange="setPageSize()">
					<option value="" selected></option>
					<option id="five" value="5" >5</option>
					<option id="ten" value="10">10</option>
					<option id="fifteen"value="15">15</option>
				</select> 개씩 보기
			</div>
		</div>
	</form>
	<div id="table">
		<table>
			<tr>
				<th>번 호</th>
				<th class="table-contents">제 목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조 회</th>
			</tr>
			<%
				int cnt = boards.size();
			for (BoardDto board : boards) {
			%>
			<tr>
				<td><%=cnt--%></td>
				<td class="table-contents"><a
					href="/bigdata/board/list.do?idx=<%=board.getIdx()%>"><%=board.getTitle()%></a></td>
				<td><%=board.getAuthor()%></td>
				<td><%=board.getRegdate()%></td>
				<td><%=board.getHit()%></td>
			</tr>
			<%
				}
			%>
			<tr>
				<th colspan="5">
					<%
						for (int i = 1; i <= pageCount; i++) {
					%> <a href="/bigdata/<%=redirect %>?pagenum=<%=i%><%=redirect2 %>"><%=i%></a> <%
 	}
 %>
				</th>
			</tr>
		</table>
		<div class="button">
			<%-- <%if(nickname == null){%>
			<input type="button" value="글쓰기"
				onclick="writecheck()">
<%}else{ %> --%>
			<input type="button" value="글쓰기"
				onclick="location.href = '/bigdata/board/write.jsp'">
			<%-- <%} %> --%>
		</div>
	</div>
</div>
<script>
	function writecheck() {
		alert("글쓰기 권한이 없습니다.")
		location.href = '/bigdata/login/login.jsp'
	}
	function setPageSize(){
		document.form.submit();
	}
</script>