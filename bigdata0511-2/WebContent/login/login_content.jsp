<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1 class="content-title">Login</h1>
<div id="login-wrap">
	<div class="center">
		<form action="<%=request.getContextPath() %>/login/loginOk.jsp" method="post">
			I D : <input type="text" name="uid" id="uid" value=""
				placeholder="아이디(필수)"> <br> P W : <input
				type="password" name="upw" id="upw" placeholder="비밀번호(필수)">
			<br>
			<div class="btn" id="procBtn">로그인</div>
		</form>
		<hr>
		<a class="btn" href="/bigdata/join/join.jsp">회원가입</a>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/js/login.js"></script>