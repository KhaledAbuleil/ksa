	package G17ServerControlers;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DataBaseConection {
		private static DataBaseConection instance = null;
		   
		private String DataBaseName;
		private String Username ;
		private String Password ;
		private String Host;
		private String Port ;
		private static String Driver;
		private Connection Conn;
		private String Str;

		public  DataBaseConection()
		{
			DataBaseName = "fmsdb";//DataBase name from mySql
			Username = "root";//default  username =root
			Password = "Braude"; // default password=Braude
			Host = "localhost";// default  host localhost
			Port = "5555";// default port 5555
			Driver = "com.mysql.jdbc.Driver"; 
			Conn=null;
			Str=null;
		}
		
		
		public void SetDataBaseName(String DataBaseName)
		{
		this.DataBaseName=DataBaseName;
		}
		
		public void SetUsertname(String Username)
		{
			this.Username=Username;
		}
		
		public void SetPassword(String Password)
		{
			this.Password=Password;
		}
		
		public void SetHost(String Host)
		{
			this.Host=Host;
		}
		
		public void SetPort(String Port)
		{
			this.Port=Port;
		}
		
		public String GetDataBaseName()
		{
			return this.DataBaseName;
		}
		
		public String GetUsername()
		{
			return Username;
		}
		
		public String GetPassword()
		{
			return Password;
		}
		
		public String GetHost()
		{
			return Host;
		}
		
		public String GetPort()
		{
			return Port;
		}
		
		public boolean close() {
			try {
				Conn.close();
				Conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		public Connection open()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try 
			{
				Connection conn = DriverManager.getConnection(Driver,GetUsername(),GetPassword());
				System.out.println("SQL connection succeed");
			} catch (SQLException ex) 
				{/* handle any errors*/
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
				}
			return Conn;
		}
	}
		