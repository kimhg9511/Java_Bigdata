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
int exist = dao.checkId(dto.getId());
if(exist != 0){
%>
	<script>
	alert("이미 존재하는 ID입니다.")
	history.back()
	</script>
<%
}else{
	exist = dao.memberInsert(dto);
	if(exist == 0){
%>
		<script>
		alert("회원가입 실패")
		history.back()
		</script>
<%
		}else{
%>
		<script>
		alert("회원가입 성공")
		location.href = "select.jsp"
		</script>
<%
	}
}
%>
