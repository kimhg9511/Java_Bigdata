package daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ActorDao {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/sakila?characterEncoding=UTF-8&serverTimezone=UTC";
	private String uid = "root";
	private String password = "1234";
	
	public ActorDao() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection connect() {
		Connection conn = null;
		
		return conn;
	}
	public ArrayList<ActorDto> actorSelect(int cnt) {
		ArrayList<ActorDto> dtos = new ArrayList<ActorDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//0. sql 
			String sql = "SELECT * FROM actor limit ?";
			//1. connect
			conn = DriverManager.getConnection(url, uid, password);
			//2. query
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cnt);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Integer actorId = rs.getInt("actor_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String lastUpdate = rs.getString("last_update");
				ActorDto dto = new ActorDto(actorId, firstName, lastName, lastUpdate);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
}
