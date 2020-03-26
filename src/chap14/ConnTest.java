package chap14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/world";
			url += "?useSSL=false&serverTimezone=UTC";
			conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("연결 성공");

			String sql = "select ID, name, countrycode, district, population from city;";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String countryCode = rs.getString(3);
				String district = rs.getString("district");
				int population = rs.getInt("population");

				System.out.print("\t|id : " + id);
				System.out.print("\t|name : " + name);
				System.out.print("\t|country : " + countryCode);
				System.out.print("\t|district : " + district);
				System.out.print("\t|population : " + population);
				System.out.println("|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
