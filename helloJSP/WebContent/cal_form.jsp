<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String n1 = null;
String n2 = null;
String op = null;
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사칙연산.</title>
</head>
<body>
	<form action="cal_form.jsp">
	<input type="text" name="num1">
	<select name="operator">
		<option>+</option>
		<option>-</option>
		<option>*</option>
		<option>/</option>
	</select>
	<input type="text" name="num2">
	<input type="submit" value="계산">	
	</form>
<%
if(n1==null || n1==""){
	return;
}else{
	n1 = request.getParameter("num1");
	n2 = request.getParameter("num2");
	op = request.getParameter("operator");
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
}
%>
</body>

</html>