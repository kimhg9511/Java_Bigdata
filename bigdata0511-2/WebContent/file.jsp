<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/file.jsp</title>
</head>
<body>
<h1>
<form action="fileOk.jsp" method="post" enctype="multipart/form-data">
write : <input type="text" name="writer"> <br>
file : <input type="file" name="uploadFile">
<button>File Upload</button>
</form>
<hr>
<%

if(request.getParameter("file") != null){
	String file = request.getParameter("file");
%>
<a href="<%=request.getContextPath() %>/fileupload/<%=file %>"><%=file %></a>
<%} %>








</h1>
</body>
</html>