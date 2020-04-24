<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = null;
String data = request.getParameter("data");
/* int iData = Integer.parseInt(data);
if(iData<10){
	response.sendRedirect("send02.jsp?data="+ data);
}else{
	response.sendRedirect("send03.jsp?data="+ data);
} */
String times = request.getParameter("times");
path = times + ".jsp?data=" + data;
response.sendRedirect(path);
%>