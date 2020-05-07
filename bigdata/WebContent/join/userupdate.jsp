<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
String id = (String)session.getAttribute("id");
MembersDao dao = MembersDao.getInstance();
MembersDto member = dao.selectOne(id);
%>
<body>
	<div class="input form center">
		<h1>회원정보 수정</h1>
		<form action="/bigdata/join/userupdateOk.jsp" method="POST" name="form">
			<div class="idpass">
				<h2>사이트 이용정보 입력</h2>
				<span>아이디</span>
				<input type="text" name="id" id="uid" class="member" placeholder="아이디" value = "<%=member.getId()%>" disabled><br>
				<span class="notice">영문자, 숫자, _만 입력 가능. 최소 3자이상 입력하세요.</span><br>
				<span>비밀번호</span>
				<input type="password" name="password" id="upw" class="member" placeholder="비밀번호" value = "<%=member.getPassword()%>"><br>
				<span>비밀번호확인</span>
				<input type="password" name="repw" id="repw" class="member" placeholder="비밀번호확인" value = "<%=member.getPassword()%>"><br>
			</div>
			<div class="private">
				<h2>개인정보 입력</h2>
				<span>닉네임</span>
				<input type="text" name="nickname" id="nick" class="member" placeholder="닉네임" value = "<%=member.getNickname()%>"><br>
				<span class="notice">공백없이 한글, 영문, 숫자만 입력 가능(한글2자, 영문4자
					이상)닉네임을 바꾸시면 앞으로 60일 이내에는 변경할 수 없습니다.</span><br> 
				<span>이름</span>
				<input type="text" name="name" id="name" class="member" placeholder="이름" value = "<%=member.getName()%>"><br> 
				<span>email</span>
				<input type="text" name="email" id="email" class="member" placeholder="email" value = "<%=member.getEmail()%>"><br>
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