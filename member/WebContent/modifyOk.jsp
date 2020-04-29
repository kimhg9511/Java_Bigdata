<%@page import="member.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="member.MemberDto" />
<jsp:setProperty property="*" name="dto" />
<%
MemberDao dao = MemberDao.getInstance();
int updateOk = dao.memberUpdate(dto);
if(updateOk == 1){
%>
<script>
	alert("변경 완료");
	location.href = "main.jsp";
</script>
<%
}else{
%>
<script>
	alert("변경 실패. 다시 시도해주세요");
	location.href = "modify.jsp";
</script>
<%	
}
%>
