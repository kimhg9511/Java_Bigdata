<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="/bigdata/resources/img/title-icon.png" type="image/x-icon">
    <title>로그인</title>
    <link rel="stylesheet" href="/bigdata/resources/css/common.css">
    <link rel="stylesheet" href="/bigdata/resources/css/login.css">
</head>
<body>
    <form action="/bigdata/login/loginOk.jsp" method="post" id="loginform">
        <div class="login form center">
            <h1>로그인</h1>
            <input type="text" id="uid" name="id" value="아이디"><br>
            <input type="text" id="upw" name="password" value="비밀번호"><br>
            <div class="button">
                <input type="button" id="login" value="로그인">
                <input type="button" id="join" value="회원가입" onclick="location.href='/bigdata/join/join.jsp'">
            </div>
        </div>
    </form>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="/bigdata/resources/js/login.js?version=4"></script>
</body>
</html>
