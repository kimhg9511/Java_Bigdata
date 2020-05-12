<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@page import="com.bigdata.dto.MemberInfoDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dao.MemberInfoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%if(session.getAttribute("id") == null) {%>	
<h1 class="content-title">Member-로그인 전</h1>
<%}else {%>
<h1 class="content-title">Member-로그인 후</h1>
<%} %>
<div id="board-wrap">
	<table class="pos">
		<tr>
			<th>num</th>
			<th>id</th>
			<th>pw</th>
			<th>name</th>
			<th>nickname</th>
			<th>email</th>
			<th>regdate</th>
		</tr>
		<%
			// db에서 전체 member 정보 가져오기
			// ArrayList<MemberInfoDto>
			JoinDao dao = JoinDao.getInstance();
			ArrayList<JoinDto> memberList = dao.getMemberList();
			 
		for (JoinDto member : memberList) {
		%>
		<tr>
			<td><%=member.getIdx() %></td>
			<td><%=member.getId() %></td>
			<td><%=member.getPw() %></td>
			<td><%=member.getName() %></td>
			<td><%=member.getNickname() %></td>
			<td><%=member.getEmail() %></td>
			<td><%=member.getRegdate() %></td>
		</tr>
		<%
			}
		%>
		
		
	</table>
</div>