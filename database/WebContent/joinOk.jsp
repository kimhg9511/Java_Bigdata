<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/bigdata?characterEncoding=UTF-8&serverTimezone=UTC";
String uid = "root";
String password = "1234";
String psql = "insert into member(id, pw, name, email, address) ";
psql += "values(?, ?, ?, ?, ?)";

String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String email = request.getParameter("email");
String address = request.getParameter("address");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, password);
	pstmt = conn.prepareStatement(psql);
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	pstmt.setString(4, email);
	pstmt.setString(5, address);	
	pstmt.executeUpdate();
}catch(Exception e){
	out.println("ERROR");
	e.printStackTrace();
}finally{
	response.sendRedirect("memberData.jsp");
	if(rs != null) rs.close();
	if(pstmt != null) pstmt.close();
	if(conn != null) conn.close();
}
%>
</body>
</html>

