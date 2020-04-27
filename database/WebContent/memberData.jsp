<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/bigdata?characterEncoding=UTF-8&serverTimezone=UTC";
String uid = "root";
String password = "1234";
String sql = "select id, pw, name, email, address from member limit 10";
String username = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
username = (String)session.getAttribute("name");
if(username == null) response.sendRedirect("login.jsp"); 
%>
<h1><%=username %>님 환영합니다.</h1>
<table border="1">
	<thead>
		<th>id</th>
		<th>pw</th>
		<th>name</th>
		<th>email</th>
		<th>address</th>
	</thead>
	
<%
try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, password);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql);
	while(rs.next()){
		String id = rs.getString("id");
		String pw = rs.getString("pw");
		String name = rs.getString("name");
		String email = rs.getString("email");	
		String address = rs.getString("address");	
%>
	<tr>
		<td><%=id %></td>
		<td><%=pw %></td>
		<td><%=name %></td>
		<td><%=email %></td>
		<td><%=address %></td>
	</tr>		
<%
	}
}catch(Exception e){
	out.println("ERROR");
	e.printStackTrace();
}finally{
	if(rs != null) rs.close();
	if(stmt != null) stmt.close();
	if(conn != null) conn.close();
}
%>
</table>
</body>
</html>

