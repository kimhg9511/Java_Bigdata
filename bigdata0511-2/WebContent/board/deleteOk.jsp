<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// deleteOk.jsp
String sIdx = request.getParameter("idx");
int idx = Integer.parseInt(sIdx);
String pw = request.getParameter("bpw");

// dao
BoardDao dao = BoardDao.getInstance();

// dto
BoardDto board = null;

// idx, pw 체크
board = dao.getBoardOne(idx);
if(pw.equals(board.getPw())){
	// delete 실행	
	int ri = dao.setBoardDelete(idx);
	if(ri==1){
%>
<script>
	alert('삭제 성공');
	location.href='<%=request.getContextPath()%>/board/list.jsp';
</script>
<%		
	}else{
%>
<script>
	alert('삭제 실패');
	history.back();
</script>
<%		
	}
}else{
%>
<script>
	alert('비번이 틀렸어요');
	history.back();
</script>
<%}%>


