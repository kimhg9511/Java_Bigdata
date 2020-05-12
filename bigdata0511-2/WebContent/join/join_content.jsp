<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="content-wrap">
	<h1 class="content-title">회원가입</h1>
	<div id="join-wrap">
		<form action="<%=request.getContextPath() %>/join/joinOk.jsp" method="post">
			<div class="pos">
				<strong>사이트 이용정보 입력</strong> <input type="text" name="uid" id="uid"
					value="" placeholder="아이디"><br> <span class="info">영문자,
					숫자, _ 만 입력 가능. 최소 3자이상 입력하세요.</span> <input type="password" name="upw"
					id="upw" placeholder="비밀번호"><br> <input
					type="password" name="upw" id="repw" placeholder="비밀번호확인">
			</div>
			<div class="hr">&nbsp;</div>
			<div class="pos">
				<strong>개인정보 입력</strong> <input type="text" name="uname" id="uname"
					value="" placeholder="이름"><br> <span class="info">공백없이
					한글,영문,숫자만 입력 가능 (한글2자, 영문4자 이상)</span><br> <span class="info">닉네임을
					바꾸시면 앞으로 60일 이내에는 변경 할 수 없습니다.</span><br> <input type="text"
					name="unickname" id="unickname" placeholder="닉네임"><br>
				<input type="text" name="uemail" id="uemail" placeholder="E-mail">
			</div>
			<div class="btnwrap">
				<a href="javascript:history.back();" class="btn white">취소</a>
				<div class="btn" id="procBtn">회원가입</div>
			</div>
		</form>
	</div>
</div>

