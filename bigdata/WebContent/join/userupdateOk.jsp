<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<c:choose>
	<c:when test='${isUpdate ne 0}'>
		<script>
	alert("업데이트 성공")
	location.href = "index.board"
</script>
	</c:when>
	<c:otherwise>
		<script>
	alert("업데이트 실패, 다시 시도해 주세요.")
	history.back()
</script>
	</c:otherwise>
</c:choose>

