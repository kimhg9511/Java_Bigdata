package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ActorDao {
	//dbcp 사용
	private DataSource ds;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public ActorDao() {
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Mysql/sakila");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<ActorDto> actorSelect(int cnt) {
		ArrayList<ActorDto> dtos = new ArrayList<ActorDto>();

		try {
			//0. sql 
			String sql = "SELECT * FROM actor limit ?";
			//1. connect
			conn = ds.getConnection();
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
