<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test='${isJoin eq 1}'>
		<script>
			alert("회원가입 성공! 로그인해주세요.")
			location.href = '/bigdata/login/login.jsp'
		</script>
	</c:when>
	<c:when test='${isJoin eq 0}'>
		<script>
			alert("이미 존재하는 ID입니다.")
			history.back()
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("회원가입에 실패하였습니다.")
			history.back()
		</script>
	</c:otherwise>
</c:choose>