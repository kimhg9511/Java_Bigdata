<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//id: asdf pw:1234
String id=request.getParameter("id");
String pw=request.getParameter("pw");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/bigdata?characterEncoding=UTF-8&serverTimezone=UTC";
String uid = "root";
String password = "1234";
String sql = "select name from member where id=? and pw=?";

try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, uid, password);
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	rs = pstmt.executeQuery();
	if(rs.next()){
		String name = rs.getString("name");
		session.setAttribute("id", id);
		session.setAttribute("name", name);		
		response.sendRedirect("memberData.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
}catch(Exception e){
	out.println(e.getMessage());	
}finally{
	if(rs != null) rs.close();
	if(pstmt != null) pstmt.close();
	if(conn != null) conn.close();
}
%>