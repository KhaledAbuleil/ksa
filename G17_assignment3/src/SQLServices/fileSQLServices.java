package SQLServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entity.user;
import G17Server.DataBaseConection;

public class fileSQLServices {
	
	private static Connection conn = DataBaseConection.getInstance()
			.getConnection1();
	public static ArrayList<String>  GetFileName() throws SQLException
	{
		ArrayList<String> names = new ArrayList<String>();
		ResultSet rs = null;
		Statement stmt;
		 stmt = conn.createStatement();
			 rs = stmt.executeQuery("SELECT f_name FROM file;");
	 		while(rs.next())
	 		{
				 // Print out the values
	 			names.add(rs.getString(1));
			} 
			rs.close();
		return names;
	}
}
