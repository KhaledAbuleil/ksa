package SQLServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entity.user;
import G17Server.DataBaseConection;

public class UserServices {
	private static Connection conn = DataBaseConection.GetConnection();
	public static user getUser(String name, String pass) throws SQLException
	{
		ResultSet rs = null;
		 PreparedStatement stmt;
		 PreparedStatement updateSales;
		user loginUser=new user();
		try{
			stmt=conn.prepareStatement("SELECT * FROM" + " users WHERE" + " u_username=? AND u_password=?");

			stmt.setString(1, name);
			
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				loginUser.setUsername(rs.getString(1));
				loginUser.setPassword(rs.getString(2));
				loginUser.setStatus("online");
				// updateSales = conn.prepareStatement("UPDATE users "+
				//		"SET u_Status = ? WHERE u_username = ?");
				//		updateSales.setString(1,name);
				//		updateSales.setString(2,"online");
				//		updateSales.executeUpdate();
				//		rs.close();*/
				return loginUser;
			} 
			else 
				return null;
	} catch (SQLException e) {
		System.err.println(e);
		return null;
	} finally {
		if (rs != null) {
			rs.close();
		}
	}
	}
}