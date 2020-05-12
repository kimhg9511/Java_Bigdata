<%@page import="com.bigdata.dao.BoardDao"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// updateOk.jsp
// 넘어온 데이터 받기 => dao 보내기
request.setCharacterEncoding("UTF-8");
String sIdx = request.getParameter("idx");
int idx = Integer.parseInt(sIdx);
String name = request.getParameter("bname");
String email = request.getParameter("bemail");;
String homepage = request.getParameter("bhomepage");;
String title = request.getParameter("btitle");;
String content = request.getParameter("bcontent");;
String pw = request.getParameter("bpw");; 

// dao
BoardDao dao = BoardDao.getInstance();
// dto
BoardDto board = null;
// 비밀번호 체크 idx , pw
board = dao.getBoardOne(idx);
if(pw.equals(board.getPw())){  // 비번 맞으면
	// 글 하나 생성
	board = new BoardDto(name, email, homepage, title, content, pw);
	// update 실행
	int ri = dao.setBoardUpdate(board, idx);
	
	// 페이지 이동
	if(ri == 1){
%>
<script>
	alert('수정 성공');
	location.href='<%=request.getContextPath()%>/board/view.jsp?idx=<%=idx%>';
</script>
<%		
	}else{
%>
<script>
	alert('수정 실패');
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





