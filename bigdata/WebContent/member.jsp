<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%
	String id = (String)session.getAttribute("id");
	if(!id.equals("admin")){
%>
<script>
		alert("잘못된 접근입니다.");
		location.href = "/bigdata/index0.jsp";
</script>
<%
	}
%>
<%-- head --%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판</title>
</head>
<%@ include file="/layout/css.jsp" %>

<%-- head end --%>
<body>
    <div id="wrap">
    	<%-- header --%>
		<%-- <%@ include file="/layout/header.jsp" %> --%>
		<jsp:include page="/layout/header.jsp"></jsp:include>
        <%-- header end --%>
        <%-- content-wrap --%>
		<%@ include file="/member_content.jsp" %> 
        <%-- content-wrap end --%>
    </div>
    <%-- wrap end --%>
    
	<%-- footer --%>
	<%@ include file="/layout/footer.jsp"%>
	<%-- footer end. --%>
<%-- js --%>
<%@ include file="/layout/js.jsp" %>
<%-- js end --%>
</body>
</html>