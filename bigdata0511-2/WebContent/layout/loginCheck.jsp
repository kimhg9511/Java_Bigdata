<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("id") == null) {%>
<script>
	alert('잘못된 접근입니다');
	location.href='<%=request.getContextPath() %>/login/login.jsp';
</script>
<%} %>
