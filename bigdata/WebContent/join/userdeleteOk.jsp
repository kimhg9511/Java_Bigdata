<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String)session.getAttribute("id");
String password = request.getParameter("password");
MembersDao dao = MembersDao.getInstance();
MembersDto member = dao.login(id, password);
if(member == null){
%>
<script>
	alert("비밀번호가 일치하지 않습니다.")
	history.back()
</script>
<%
}else{
	int isDelete = dao.deleteMember(id,password);
	if(isDelete == 0){
%>
<script>
		alert("삭제에 실패하였습니다. 다시 시도해 주세요.")
		history.back()
</script>
<%
	} else{
		session.invalidate();
%>
<script>
		alert("삭제완료.")
		location.href="/bigdata/index0.jsp"
</script>
<%
	}
}
%>