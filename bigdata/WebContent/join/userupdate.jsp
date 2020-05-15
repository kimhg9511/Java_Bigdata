<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/layout/logincheck.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="/bigdata/resources/img/title-icon.png"
	type="image/x-icon">
<title>회원정보수정</title>
<link rel="stylesheet" href="/bigdata/resources/css/common.css">
<link rel="stylesheet" href="/bigdata/resources/css/join.css">
</head>
<body>
	<div class="input form center">
		<h1>회원정보 수정</h1>
		<form action="/bigdata/join/userupdateOk.jsp" method="POST" name="form">
			<div class="idpass">
				<h2>사이트 이용정보 입력</h2>
				<span>아이디</span>
				<input type="text" name="id" id="uid" class="member" placeholder="아이디" value = "${member.id }" disabled><br>
				<span>비밀번호</span>
				<input type="password" name="password" id="upw" class="member" placeholder="비밀번호" value = ""><br>
				<span>비밀번호확인</span>
				<input type="password" name="repw" id="repw" class="member" placeholder="비밀번호확인" value = ""><br>
			</div>
			<div class="private">
				<h2>개인정보 입력</h2>
				<span>닉네임</span>
				<input type="text" name="nickname" id="nick" class="member" placeholder="닉네임" value = "${member.nickname }"><br>
				<span>이름</span>
				<input type="text" name="name" id="name" class="member" placeholder="이름" value = "${member.name }"><br> 
				<span>email</span>
				<input type="text" name="email" id="email" class="member" placeholder="email" value = "${member.email }"><br>
			</div>
			<div class="button">
				<input type="button" id="userupdate" value="수정"> 
				<input type="button" value="취소" onclick="javascript:location.href='/bigdata/index0.jsp'">
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
	<script src="/bigdata/resources/js/board2.js"></script>
</body>
</html>