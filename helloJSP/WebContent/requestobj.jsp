<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String serverName = request.getServerName();
	int serverPort = request.getServerPort();
	String method = request.getMethod();
	String protocol = request.getProtocol();
	StringBuffer url = request.getRequestURL();
	String uri = request.getRequestURI();
	String remoteAddr = request.getRemoteAddr();
	String servletPath = request.getServletPath();
	String contextPath = request.getContextPath();	
%>
<h2>
ServerName: <%=serverName %><br>
ServerPort: <%=serverPort%><br>
Method: <%=method %><br>
Protocol: <%=protocol %><br>
Url: <%=url %><br>
Uri: <%=uri %><br>
RemoteAddr: <%=remoteAddr %><br>
ServletPath: <%=servletPath %><br>
ContextPath: <%=contextPath %><br>
</h2>
</body>
</html>