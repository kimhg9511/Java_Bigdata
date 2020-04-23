<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				for (int i = 15; i > 0; i--) {
			%>
			<tr>
				<td><%=i%></td>
				<td class="table-contents"><a href="/bigdata/board/list.jsp">게시판
						글입니다 <%=i%></a></td>
				<td>김현겸</td>
				<td>2020/04/16</td>
				<td>0</td>
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
			<input type="button" value="글쓰기"
				onclick="location.href = '/bigdata/login/login.jsp'">
		</div>
	</div>
</div>