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
		ResultSet rs;
		 PreparedStatement stmt;
		 PreparedStatement updateSales;
		user loginUser=new user();
			stmt=conn.prepareStatement("SELECT * FROM" + " users WHERE" + " name=? AND password=?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				loginUser.setUsername(rs.getString(1));
				loginUser.setfirstname(rs.getString(2));
				loginUser.setlastname(rs.getString(3));
				loginUser.setPassword(rs.getString(4));
				loginUser.setRole(rs.getString(5));
				loginUser.setStatus("online");
				 updateSales = conn.prepareStatement("UPDATE users "+
						"SET u_Status = ? WHERE u_username = ?");
						updateSales.setString(1,"online");
						updateSales.setString(2,"Diamond");
						updateSales.executeUpdate();
						rs.close();
				return loginUser;
			} 
			else 
				return null;
	}
}
