<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test='${isDelete eq 1}'>
		<script>
			alert("삭제완료.")
			location.href = "index.board"
		</script>
	</c:when>
	<c:when test='${isDelete eq 0}'>
		<script>
			alert("삭제에 실패하였습니다. 다시 시도해 주세요.")
			history.back()
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("비밀번호가 일치하지 않습니다.")
			history.back()
		</script>
	</c:otherwise>
</c:choose>