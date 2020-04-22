<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebContent/scriptlet.jsp</title>
</head>
<body>
<!--  
<h1>

<%--
	int i = 0;
	while(true){
		i++;
		out.println("2 * " + i + " = " + (2*i)+"<br>");
		if(i >=9 ) break;
	}
	
	int sum = 0;
	for(int j=1;j<=10;j++){
		sum += j;
	}
%>
1부터 10까지의 합은 <%=sum %>
</h1>
<ul>
	<%
	String li = "";
	for(int k=0;k<3;k++){
		li = "<li>1</li>";
		out.println(li);
	}
	--%>
</ul>
-->
<table border="1">
	<% 
	String td = "";
	for(int k=0;k<3;k++){
		for(int i=0;i<=9;i++){
			out.println("<tr>");
			for(int j=2;j<5;j++){
				if((3*k+j)==10)break;
				if(i==0){
				td = "<th>" + (3*k+j) + "단</th>";
				out.println(td);					
				}else{
					td = "<td>" + (3*k+j) + " * " + i + " = " + (3*k+j)*i + "</td>";
					out.println(td);
				}
			}
			out.println("</tr>");
		}
	}
	%>
</table>
</body>
</html>