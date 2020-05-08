<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int idx = Integer.parseInt(request.getParameter("idx"));
String pw = request.getParameter("pw");
BoardDao dao = BoardDao.getInstance();
int isDelete = dao.deleteBoard(idx, pw);
if(isDelete==0){
%>
<script>
	alert("삭제 실패. 패스워드를 확인하세요.");
	history.back();
</script>
<%
}else{
%>
<script>
	alert("글이 삭제되었습니다.");
	location.href="/bigdata/index0.jsp";
</script>
<%
}
%>