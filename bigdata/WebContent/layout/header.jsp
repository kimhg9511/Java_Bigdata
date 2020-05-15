<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");
String nickname = (String) session.getAttribute("nickname");
%>
<header>
	<div id="logo">
		<a href="index.board" class="menu">게시판</a>
	</div>
	<div id="nav-bar">
		<ul>
			<c:choose>
				<c:when test="${empty name}">
					<li><a href="/bigdata/login/login.jsp" class="menu">Login</a></li>
					<li><a href="/bigdata/join/join.jsp" class="menu">회원가입</a></li>
					<li><a href="index.board" class="menu">게시판</a></li>
				</c:when>
				<c:when test='${id eq "admin"}'>
					<li>${nickname }(${name })님환영합니다.</li>
					<li><a href="/bigdata/login/logout.jsp" class="menu">Logout</a></li>
					<li><a href="index.board" class="menu">게시판</a></li>
					<li><a href="list.member" class="menu">회원정보</a></li>
					<li><a href="update.member" class="menu">회원정보수정</a></li>
					<li><a href="/bigdata/join/userdelete.jsp" class="menu">회원
							탈퇴</a></li>
				</c:when>
				<c:otherwise>
					<li>${nickname }(${name })님환영합니다.</li>
					<li><a href="/bigdata/login/logout.jsp" class="menu">Logout</a></li>
					<li><a href="index.board" class="menu">게시판</a></li>
					<li><a href="update.member" class="menu">회원정보 수정</a></li>
					<li><a href="/bigdata/join/userdelete.jsp" class="menu">회원 탈퇴</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</header>
