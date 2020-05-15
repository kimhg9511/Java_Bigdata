<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test='${isLogin eq 1}'>
		<script>
			location.href = "/index.board"
		</script>
	</c:when>
	<c:when test='${isLogin eq 0}'>
		<script>
			location.href = "list.member"
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("회원정보가 일치하지 않습니다.");
			location.href = "/bigdata/login/login.jsp";
		</script>
	</c:otherwise>
</c:choose>