<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="board" class="com.bigdata.dto.BoardDto" />
<jsp:setProperty property="*" name="board" />
<%
BoardDao dao = BoardDao.getInstance();
int isInsert = dao.insertBoard(board);
if (isInsert == 0) {
%>
<script>
	alert("글쓰기에 실패하였습니다.");
	history.back();
</script>
<%
	} else {
	int max = dao.getMaxIdx();
	dao.updateGroup(max);
%>
<script>
	alert("글이 등록되었습니다.");
	location.href = "/bigdata/index0.jsp";
</script>
<%
	}
%>

