<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String uid = request.getParameter("uid");
%>
<jsp:useBean id="member" class="com.bigdata.dto.MembersDto" />
<jsp:setProperty property="*" name="member" />
<%
MembersDao dao = MembersDao.getInstance();
MembersDto checkId = dao.selectOne(member.getId());
if(checkId != null){
%>
	<script>
	alert("이미 존재하는 ID입니다.")
	history.back()
	</script>
<%
}else{
	int isCreate = dao.createMember(member);
	if(isCreate == 0){
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
