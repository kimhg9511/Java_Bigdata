<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/bigdata?characterEncoding=UTF-8&serverTimezone=UTC";
String uid = "root";
String password = "1234";
String sql = "select nickname from members where id=? and password=?";
String id = request.getParameter("uid");
String pw = request.getParameter("upw");
try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, password);
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	rs = pstmt.executeQuery();
	if(rs.next()){
		String nick = rs.getString("nickname");
		session.setAttribute("id", id);
		session.setAttribute("nick", nick);		
		response.sendRedirect("/bigdata/index0.jsp");
	}else{
%>
<script>
	alert("회원정보가 일치하지 않습니다.");
	location.href = "/bigdata/login/login.jsp";
</script>
<%
	}
}catch(Exception e){
	out.println(e.getMessage());	
}finally{
	if(rs != null) rs.close();
	if(pstmt != null) pstmt.close();
	if(conn != null) conn.close();
}
%>
</body>
</html>