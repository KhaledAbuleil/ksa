	package G17Server;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	public class DataBaseConection {
		private static DataBaseConection instance = null;
		private String DataBaseName = "fmsdb";		//ccrm_db
		private String Username = "root"; //default     braude
		private String Password = "Braude";     // default	Braude
		private String Host = "localhost"; // default   
		private String Port = "4444";      // default
		private String port = "3306";      // default
		private static String Driver = "com.mysql.jdbc.Driver"; // default
		private String Str;
		private Connection conn = null;
		public  DataBaseConection()
		{

		}
		private String connStr;
		public static DataBaseConection getInstance() {
			if (instance == null) {
				System.out.println("null");
				 try {		           
			            Class.forName(Driver).newInstance();
			        } catch (Exception ex) {
			        	System.out.println("exceptipon");
			            ex.printStackTrace();
			        }
				instance = new DataBaseConection();
			}
			return instance;
		}

		

		private boolean openConnection()
		{
			try {
				System.out.println("try");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/fmsdb","root","Braude");
				return true;
			} catch (SQLException e) {
				System.out.println("try2");
				e.printStackTrace();
			}
			return false;
		}

		public Connection getConnection1()
		{
			if (conn == null) {
				System.out.println("conn=null");
				if (openConnection()) {
					System.out.println("6");
					System.out.println("Connection opened");
					return conn;
				} else {
					return null;
				}
			}
			return conn;
		}

		public void close() {
			System.out.println("Closing connection");
			try {
				conn.close();
				conn = null;
			} catch (Exception e) {
			}
		}
		
		
		
		
		public String getMysqlConnStr() {
			String host = GetHost();
			String port = GetPort();
			String dbname = GetDataBaseName();
			String connStr = null;
			if(!GetHost().isEmpty() && !GetPort().isEmpty() && !GetDataBaseName().isEmpty()){
				connStr = "jdbc:mysql://"+GetHost()+":"+
			                                     "/"+GetDataBaseName()+"?zeroDateTimeBehavior=convertToNull";
			}
			return connStr;
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
		
		public  String GetDataBaseName()
		{
			return DataBaseName;
		}
		
		public  String GetUsername()
		{
			return Username;
		}
		
		public  String GetPassword()
		{
			return Password;
		}
		
		public  String GetHost()
		{
			return Host;
		}
		
		public  String GetPort()
		{
			return Port;
		}
		

	}
		