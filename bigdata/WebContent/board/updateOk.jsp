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
int isUpdate = dao.updateBoard(board);
if(isUpdate == 0){
%>
<script>
	alert("업데이트 실패. 비밀번호를 확인해주세요.");
	history.back();
</script>
<%
} else {
%>
<script>
	alert("글이 수정되었습니다.");
	location.href = "/bigdata/board/list.jsp?idx=<%=board.getIdx()%>"
</script>
<%
}
%>