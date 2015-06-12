	package G17Server;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class DataBaseConection {
		private static DataBaseConection instance ;
		private Connection conn = null;
		private static String DataBaseName;
		private String Username ;
		private String Password ;
		private static String Host;
		private static String Port ;
		private static String Driver;
		private static Connection Conn;
		private static String Str;

		public  DataBaseConection()
		{
			DataBaseName = "fmsdb";//DataBase name from mySql
			Username = "root";//default  username =root
			Password = "Braude"; // default password=Braude
			Host = "localhost";// default  host localhost
			Port = "4444";// default port 5555
			Conn=null;
			Str=null;
			instance=null;
		}
		public static Connection GetConnection()
		{
		if (instance == null) {
				 try {		           
			            Class.forName("com.mysql.jdbc.Driver").newInstance();
			        } catch (Exception ex) {/* handle the error*/
			            ex.printStackTrace();
			        }
				instance = new DataBaseConection();
			}
		Str = "jdbc:mysql://"+GetHost()+":"+GetPort()+"/"+GetDataBaseName()+"?zeroDateTimeBehavior=convertToNull";
				try {
					Conn=DriverManager.getConnection(Str);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Conn;
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
		
		public static String GetDataBaseName()
		{
			return DataBaseName;
		}
		
		public String GetUsername()
		{
			return Username;
		}
		
		public String GetPassword()
		{
			return Password;
		}
		
		public static String GetHost()
		{
			return Host;
		}
		
		public static String GetPort()
		{
			return Port;
		}
		
		public void close() {
			System.out.println("Closing connection");
			try {
				conn.close();
				conn = null;
			} catch (Exception e) {
			}
		}

	}
		