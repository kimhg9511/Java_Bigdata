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
String url = "jdbc:mysql://localhost:3306/sakila?characterEncoding=UTF-8&serverTimezone=UTC";
String uid = "root";
String password = "1234";
String sql = "select actor_id, first_name, last_name, last_update from actor limit 10";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Actor Table</h1>
<table border="1">
	<thead>
		<th>actor_id</th>
		<th>first_name</th>
		<th>last_name</th>
		<th>last_update</th>
	</thead>
	
<%
try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, password);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql);
	while(rs.next()){
		String id = rs.getString("actor_id");
		String fn = rs.getString("first_name");
		String ln = rs.getString("last_name");
		String date = rs.getString("last_update");	
%>
	<tr>
		<td><%=id %></td>
		<td><%=fn %></td>
		<td><%=ln %></td>
		<td><%=date %></td>
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