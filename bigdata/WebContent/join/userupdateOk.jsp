<%@page import="com.bigdata.dto.MembersDto"%>
<%@page import="com.bigdata.dao.MembersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = (String)session.getAttribute("id");
%>
<jsp:useBean id="member" class="com.bigdata.dto.MembersDto" />
<jsp:setProperty property="*" name="member" />
<jsp:setProperty property="id" name="member" value="<%=id %>"/>
<%
MembersDao dao = MembersDao.getInstance();
int isUpdate = dao.updateMember(member);
if(isUpdate != 0){
%>
<script>
	alert("업데이트 성공")
	location.href = "userupdate.jsp"
</script>
<%
}else{
%>
<script>
	alert("업데이트 실패, 다시 시도해 주세요.")
	location.href = "userupdate.jsp"
</script>
<%	
}
%>


