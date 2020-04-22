<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../../img/title-icon.png" type="image/x-icon">
    <title>게시글 수정</title>
    <link rel="stylesheet" href="../../css/common.css">
    <link rel="stylesheet" href="../../css/board.css">
</head>
<body>
    <div class="write form">
        <h1>게시판 글 수정하기</h1>
        <h2>작 성 자</h2><input id="writer" type="text" value="작성자 기본값"><br>
        <h2>E-mail</h2><input id="mail" type="text" value="mail 기본값"><br>
        <h2>홈페이지</h2><input id="homep" type="text" value="홈페이지 기본값"><br>
        <h2>제 목</h2><input id="btitle" type="text" value="제목 기본값"><br>
        <h2>내 용</h2><textarea name="" id="bcontent" cols="30" rows="20">내용 기본값</textarea><br>
        <div class="tail">
            <h2>비밀번호</h2><input id="upw" type="password"><br> 
        </div>
    </div>
    <div class="button">
        <input type="button" id="update" value="수정">
        <input type="button" id="reset" value="다시 수정">
        <input type="button" value="뒤로" onclick="location.href='../index1.jsp'">
    </div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="../../js/board.js"></script>
</body>
</html>