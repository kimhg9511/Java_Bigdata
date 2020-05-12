<%@page import="com.bigdata.dto.JoinDto"%>
<%@page import="com.bigdata.dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 회원정보 수정할 데이터 가저오기
String id = (String)session.getAttribute("id");

JoinDao dao = JoinDao.getInstance();
JoinDto member = dao.getMember(id);

int idx = member.getIdx();
String pw = member.getPw();
String name = member.getName();
String nickname = member.getNickname();
String email = member.getEmail();
String regdate = member.getRegdate();
//out.println("name:"+name);
%>	
<div id="content-wrap">
	<h1 class="content-title">회원 정보수정</h1>
	<div id="join-wrap">
		<form action="<%=request.getContextPath() %>/join/join_updateOk.jsp" method="post">
			<input type="hidden" name="uid" value="<%=id %>">
			<div class="pos">
				<strong>사이트 이용정보 입력</strong> <br>
				ID : <%=id %><br> 
				<span class="info">ID / 비밀번호는 영문자,숫자, _ 만 입력 가능. 최소 3자이상 입력하세요.</span><br> 
				PW : <input type="password" name="upw" id="upw" placeholder="비밀번호" value="<%=pw %>"><br> 
				RE-PW : <input type="password" name="upw" id="repw" placeholder="비밀번호확인" value="<%=pw %>">
			</div>
			<div class="hr">&nbsp;</div>
			<div class="pos">
				<strong>개인정보 입력</strong> <br>
				NAME: <input type="text" name="uname" id="uname" placeholder="이름" value="<%=name %>"><br> 
				<span class="info">공백없이 한글,영문,숫자만 입력 가능 (한글2자, 영문4자 이상)</span><br> 
				<span class="info">닉네임을 바꾸시면 앞으로 60일 이내에는 변경 할 수 없습니다.</span><br> 
				NICKNAME : <input type="text" name="unickname" id="unickname" placeholder="닉네임" value="<%=nickname %>"><br>
				EMAIL : <input type="text" name="uemail" id="uemail" placeholder="E-mail" value="<%=email %>">
			</div>
			<div class="btnwrap">
				<a href="javascript:history.back();" class="btn white">취소</a>
				<div class="btn" id="updateBtn">회원정보수정</div>
			</div>
		</form>
	</div>
</div>

