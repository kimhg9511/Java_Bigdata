<%@page import="member.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String)session.getAttribute("id");
String pw = request.getParameter("pw");
MemberDao dao = MemberDao.getInstance();
int isDel = dao.memberDelete(id, pw);
if(isDel == 1){
	session.invalidate();
%>
<script>
	alert("삭제가 완료되었습니다.")
	location.href="select.jsp"
</script>
<%	
}else{
%>
<script>
	alert("삭제실패, 다시 시도해 주세요")
	location.href="deletemem.jsp"
</script>
<%
}
%>