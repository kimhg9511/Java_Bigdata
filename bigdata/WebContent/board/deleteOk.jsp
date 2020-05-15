<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${isDelete == 0}">
		<script>
			alert("삭제 실패. 패스워드를 확인하세요.");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("글이 삭제되었습니다.");
			location.href = 'index.board';
		</script>
	</c:otherwise>
</c:choose>