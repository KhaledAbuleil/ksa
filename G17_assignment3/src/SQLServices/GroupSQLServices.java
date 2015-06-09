package SQLServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.request;
import Entity.user;
import G17Server.DataBaseConection;

public class GroupSQLServices {
	private static Connection conn = DataBaseConection.getInstance()
			.getConnection1();
	public static ArrayList<Integer>  getGroupsNum (String username)
	{
		String sql=("SELECT g_id FROM fmsdb.useringroup"
				+"where u_username=?");
		ArrayList<Integer> groups = new ArrayList<Integer>();
			ResultSet rs = null;
			 PreparedStatement stmt=null;
				try {
					stmt=conn.prepareStatement(sql);
				stmt.setString(1,username);
				rs = stmt.executeQuery();
				int i=0;
				while (rs.next()) 
				{
					groups.add(i, rs.getInt(1));;
				}
				rs.close();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("GroupSQLSErvices->cannot get the groups id");
				}
				
				return groups;
	}
	public static ArrayList<String>  getGroupsName ( ArrayList<Integer> lst)
	{
		String sql=("SELECT g_groupname FROM fmsdb.useringroup"
				+"where g_id=?");
		ArrayList<String> groupsName = new ArrayList<String>();
		ResultSet rs = null;
		 PreparedStatement stmt=null;
		 for(int i=0;i<lst.size();i++)
		 {
			try {
				stmt=conn.prepareStatement(sql);
			stmt.setInt(1,lst.get(i));
			rs = stmt.executeQuery();
			if(rs.next())
				groupsName.add(i, rs.getString(1));
			rs.close();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("GroupSQLSErvices->cannot get the groups name");
			}
		 }
		return  groupsName;
	}
}