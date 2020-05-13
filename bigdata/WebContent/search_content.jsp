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
int pageList = (int) request.getAttribute("pageList");
String search = (String)request.getAttribute("search");
String isearch = (String)request.getAttribute("isearch");
%>
<!DOCTYPE html>
<div id="content-wrap">

	<div class="boardconfig">
		<form action="search.do" method="get" name="form" class="form">
			<div class="search">
				<select name="search" class="search">
					<option value="title">제목</option>
					<option value="author">작성자</option>
				</select> (으)로 검색: <input type="text" name="isearch" class="isearch">
				<input type="submit" value="검색">
			</div>
		</form>
		<form action="search.do" method="get" name="form2" class="form">
			<input type="hidden" name="search" value=<%=search %>> <input
				type="hidden" name="isearch" value=<%=isearch %>>
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
			<%
			int cnt = count - pageList*(pageNum-1);
			if(count==0){
			%>
			<tr>
				<td colspan="5">게시글이 없습니다.</td>
			</tr>
			<%
			} else {
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
			}
			%>
			<tr>
				<th colspan="5">
					<%
						for (int i = 1; i <= pageCount; i++) {
					%> <a
					href="/bigdata/search.do?pagenum=<%=i %>&search=<%=search%>&isearch=<%=isearch%>&page=<%=pageList%>"><%=i%></a>
					<%
 						}
 %>
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