<%@page import="bigdata.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String uid = request.getParameter("uid");
%>
<jsp:useBean id="dto" class="bigdata.MembersDto" />
<jsp:setProperty property="*" name="dto" />
<%
MembersDao dao = MembersDao.getInstance();
int exist = dao.checkId(dto.getUid());
if(exist != 0){
%>
	<script>
	alert("이미 존재하는 ID입니다.")
	history.back()
	</script>
<%
}else{
	exist = dao.membersInsert(dto);
	if(exist == 0){
%>
<script>
		alert("회원가입에 실패하였습니다.")
		history.back()
</script>
<%	}else{ %>
<script>
		alert("회원가입 성공! 로그인해주세요.")
		location.href = '/bigdata/login/login.jsp'
</script>
<%
	}
}
%>
