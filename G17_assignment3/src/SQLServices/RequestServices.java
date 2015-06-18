package SQLServices;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entity.request;
import G17Server.DataBaseConection;

public class RequestServices {
	private static Connection conn = DataBaseConection.getInstance()
			.getConnection1();
public static void InserNewRequest (request nrequest)	
{

	String sql ="insert into `request`(`r_username`,`r_group`,`r_join_retire`)" 
			+"values (?,?,?);";
	PreparedStatement ps=null;
	
	
	try {
		ps=conn.prepareStatement(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		ps.setString(1,nrequest.getusername());
		ps.setString(3,nrequest.getname());
		ps.setString(2,nrequest.getRtype());
		ps.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
