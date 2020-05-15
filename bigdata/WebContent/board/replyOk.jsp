<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${isReply == 0}">
		<script>
			alert("답변에 실패하였습니다.");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("답변이 등록되었습니다.");
			location.href = "/bigdata/index.board";
		</script>
	</c:otherwise>
</c:choose>

