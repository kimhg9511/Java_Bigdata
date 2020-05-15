<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${isUpdate == 0}">
		<script>
			alert("업데이트 실패. 비밀번호를 확인해주세요.");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("글이 수정되었습니다.");
			location.href="/bigdata/board/list.board?idx=${idx }";
		</script>
	</c:otherwise>
</c:choose>

