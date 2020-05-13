<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="board" class="com.bigdata.dto.BoardDto" />
<jsp:setProperty property="*" name="board" />
<%
int isInsert = (int)request.getAttribute("isInsert");
if (isInsert == 0) {
%>
<script>
	alert("답변에 실패하였습니다.");
	history.back();
</script>
<%
	} else {
%>
<script>
	alert("답변이 등록되었습니다.");
	location.href = "/bigdata/index.do";
</script>
<%
	}
%>

