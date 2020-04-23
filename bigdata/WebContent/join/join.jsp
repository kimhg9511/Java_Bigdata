<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="/bigdata/resources/img/title-icon.png" type="image/x-icon">
    <title>회원가입</title>
    <link rel="stylesheet" href="/bigdata/resources/css/common.css">
    <link rel="stylesheet" href="/bigdata/resources/css/join.css">
</head>
<body>
    <div class="input form center">
        <h1>회원 가입</h1>
        <div class="idpass">
            <h2>사이트 이용정보 입력</h2>
            <span>아이디</span><input type="text" id="uid" value="아이디"><br>
            <span class="notice">영문자, 숫자, _만 입력 가능. 최소 3자이상 입력하세요.</span><br>
            <span>비밀번호</span><input type="text" id="upw" value="비밀번호"><br>
            <span>비밀번호확인</span><input type="text" id="repw" value="비밀번호확인"><br>
        </div>
        <div class="private">
            <h2>개인정보 입력</h2>
            <span>닉네임</span><input type="text" id="nick" value="닉네임"><br>
            <span class="notice">공백없이 한글, 영문, 숫자만 입력 가능(한글2자, 영문4자 이상)닉네임을 바꾸시면 앞으로 60일 이내에는 변경할 수 없습니다.</span><br>
            <span>이름</span><input type="text" id="name" value="이름"><br>
            <span>email</span><input type="text" id="email" value="email"><br>
        </div>
        <div class="button">
            <input type="button" id="join" value="회원가입">
            <input type="button" value="취소" onclick="location.href='/bigdata/login/login.jsp'">
        </div>
    </div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="/bigdata/resources/js/join.js"></script>
</body>
</html>