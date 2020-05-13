<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String nickname = (String)session.getAttribute("nickname");
BoardDao dao = BoardDao.getInstance();
ArrayList<BoardDto> boards = dao.getBoardAll();
%>
<!DOCTYPE html>
<div id="content-wrap">
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
				<td class="table-contents"><a href="list.do?idx=<%=board.getIdx()%>"><%=board.getTitle() %></a></td>
				<td><%=board.getAuthor() %></td>
				<td><%=board.getRegdate() %></td>
				<td><%=board.getHit() %></td>
			</tr>
			<%
				}
			%>
			<tr>
				<th colspan="5">
					<%
						for (int i = 1; i < 6; i++) {
					%> <a href="#"><%=i%></a> <%
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
function writecheck(){
	alert("글쓰기 권한이 없습니다.")
	location.href = '/bigdata/login/login.jsp'	
}
</script>