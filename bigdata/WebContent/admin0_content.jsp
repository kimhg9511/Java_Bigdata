<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String nickname = (String)session.getAttribute("nickname");
ArrayList<MembersDto> members = (ArrayList<MembersDto>)request.getAttribute("members");
%>
<!DOCTYPE html>
<div id="content-wrap">
	<div id="table">
		<table>
			<tr>
				<th>ID</th>
				<th>비밀번호</th>
				<th>닉네임</th>
				<th>이름</th>
				<th>이메일</th>
				<th>가입일</th>
			</tr>
			<%
				for (MembersDto member : members) {
			%>
			<tr>
				<td><%=member.getId() %></td>
				<td><%=member.getPassword() %></td>
				<td><%=member.getNickname() %></td>
				<td><%=member.getName() %></td>
				<td><%=member.getEmail() %></td>
				<td><%=member.getDate() %></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</div>