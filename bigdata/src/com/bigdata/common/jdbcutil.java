package com.bigdata.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class jdbcutil {
	// Connect using DBCP(open)
	public static Connection getConnection() {
		DataSource ds = null;
		Connection conn = null;
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Mysql/bigdata");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// Close..
	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
 		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			if(rs != null) rs.close();
 		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}	
