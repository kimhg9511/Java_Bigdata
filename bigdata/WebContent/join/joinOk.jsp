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
String psql = "insert into members(id, password, nickname, name, email)";
psql += "values(?, ?, ?, ?, ?)";
String chk_sql = "select * from members where id=?";
String id = request.getParameter("uid");
String pw = request.getParameter("upw");
String nick = request.getParameter("nick");
String name = request.getParameter("name");
String email = request.getParameter("email");
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
	pstmt = conn.prepareStatement(chk_sql);
	pstmt.setString(1,id);
	rs = pstmt.executeQuery();
	if(rs.next()){
%>
<script>
	alert("이미 존재하는 id입니다.");
	location.href="/bigdata/join/join.jsp";
</script>
<%		
	}else{
	pstmt.close();
	pstmt = conn.prepareStatement(psql);
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, nick);
	pstmt.setString(4, name);
	pstmt.setString(5, email);	
	pstmt.executeUpdate();
%>
<script>
	alert("회원가입 성공! 로그인해주세요.");
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

