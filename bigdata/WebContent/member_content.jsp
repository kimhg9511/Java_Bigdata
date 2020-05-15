<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<c:forEach items="${members }" var="member">
				<tr>
					<td>${member.id}</td>
					<td>${member.password}</td>
					<td>${member.nickname}</td>
					<td>${member.name}</td>
					<td>${member.email}</td>
					<td>${member.date}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>