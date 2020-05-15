<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_core.jsp</title>
</head>
<body>
<!-- value set -->
<c:set var="id" value="abcde" />
ID: <c:out value="${id }"></c:out><br>
<c:remove var="id" />
ID(removed): <c:out value="${id }"></c:out><br>
<hr>
<!-- try/catch -->
<c:catch var="error">
	${2/0 }
</c:catch>
<c:out value="${error }" /><br>
<hr>
<!-- if -->
<c:if test="${1+2==3 }">
	show content if condition is true.
</c:if>
<c:if test="${1+2!=3 }">
	show content if condition is false.
</c:if>
<!-- if/else use c:choose -->
<hr>
<!-- for -->
<c:forEach var="i" begin="0" end="10" step="3">
	${i }
</c:forEach>
</body>
</html>