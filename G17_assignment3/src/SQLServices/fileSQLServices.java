package SQLServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entity.MyFile;
import Entity.user;
import Entity.userfiles;
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
	public static void  InsertNewFile(MyFile file) throws SQLException
	{
		ResultSet rs = null;
		String sql = "insert into `file` (`f_name`, `f_type`, `f_size`, `f_describe`, `f_privilege`, `f_address`,`f_owner`) "
		+" values (?,?,?,?,?,?,?);";
	    PreparedStatement ps = null; 
	      ps = conn.prepareStatement(sql);
	      ps.setString(1, file.getFname());
	      ps.setString(2, file.getType());
	      ps.setInt(3, file.getSize());
	      ps.setString(4, file.getDescribe());
	      ps.setInt(5, file.getPrivilege());
	      ps.setString(6, file.getPhysicleAdd());
	      ps.setString(7,file.getOwner());
	      ps.execute();
	      
			boolean res = ps.execute();
			ps.close();
	}
	public static userfiles[] getfileslist() throws SQLException
	{
		userfiles[] fileslist = new userfiles[2];
		ResultSet rs = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		int i=0;

		//fname
		     Statement stmt;
		        stmt = conn.createStatement();
			         rs = stmt.executeQuery("SELECT f_name FROM file;");
	   //owner
			 Statement stmt1 ;
				 stmt1 = conn.createStatement();
					 rs1 = stmt1.executeQuery("SELECT f_owner FROM file;");
		//path
			 Statement stmt2;
				 stmt2 = conn.createStatement();
					 rs2 = stmt2.executeQuery("SELECT f_Vertadd FROM file;");
	 		while(rs.next())
	 		{
				 // Print out the values
	 			
	 			fileslist[i].Fname=rs.getString(1); 	
	 			fileslist[i].vertadd=rs2.getString(1); 	
	 			fileslist[i].Owner=rs1.getString(1); 
	 			i++;

			} 
			rs.close();
			
		return fileslist;
	}
}
