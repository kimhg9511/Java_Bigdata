<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
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
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	String[] hobbys = request.getParameterValues("hobby");
	String major = request.getParameter("major");
	String protocol = request.getParameter("protocol");
	String speak = request.getParameter("speak");
%>
<h2>
Name: <%=name %><br>
ID: <%=id%><br>
Password: <%=pw %><br>
Hobbys: <%=Arrays.toString(hobbys) %><br>
Major: <%=major %><br>
Protocol: <%=protocol %><br>
speak: <%=speak %><br>
</h2>

<%
String key;
int i=0;
Enumeration<String> params = request.getParameterNames();
while(params.hasMoreElements()){
	key = params.nextElement();
	out.println(key + "<br>");
	if(key.equals("hobby")){
		for(String h : hobbys){
			out.println(key + "[" + i + "]" + " : " + h + "<br>");
			i++;
		}
	}else{
		out.println(key + " : " + request.getParameter(key));
	}
}
%>
</body>
</html>