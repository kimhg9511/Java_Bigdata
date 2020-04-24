<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String n1 = request.getParameter("num1");
String n2 = request.getParameter("num2");
String op = request.getParameter("operator");
double num1 = 0;
double num2 = 0;
double result = 0;
boolean isNumber = false;
try{
num1 = Double.parseDouble(n1);
num2 = Double.parseDouble(n2);
}catch(NumberFormatException e){
	out.println("It's not number.");
	return;
}
switch(op){
	case "+":
		result = num1 + num2;
		break;
	case "-":
		result = num1 - num2;
		break;
	case "*":
		result = num1 * num2;
		break;
	case "/":
		if(num2==0){
			out.println("<h1>0으로 나누지 마시오.</h1>");
			return;
		}else{
			result = num1 / num2;
		}
		break;
	default:
		return;
}
result = Math.round(result*1000);
result /= 1000;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result.</title>
</head>
<body>
<h1><%=num1 %> <%=op %> <%=num2 %> = <%=result %></h1>
<a href="cal_form.html">다시하기</a>
</body>
</html>