<%@ page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int i = 10;
	String str = "abcde";
	public int sum(int a, int b){
		return a+b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int[] iArr = {10, 20, 30};
	out.println(Arrays.toString(iArr) + "<br>");
%>
<%=Arrays.toString(iArr) %><br>
<%
	out.println("i = " + i + "<br>");
%>
str = <%=str %><br>
<%
	out.println("sum = " + sum(1,5) + "<br>");
%>
sum = <%=sum(10,5) %><br>
<!-- HTML 주석 : 소스보기로 보임 -->
<%-- JSP 주석 : 소스보기로 보이지 않음 --%>
</body>
</html>