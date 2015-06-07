package G17Server;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import G17ServerControlers.DataBaseConection;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FMSSErverGUI extends JFrame {
	private JPasswordField passwordField;
	private JTextField usernameField;
	private JLabel lblPassword ;
	private JLabel lblUsername;
	private JButton btnConnect;
	private JLabel lblConnecttoserver;
	private FMSserver server;
	private JTextArea textPane;
	private JLabel lblDb;
	private JTextField DBtext;
	private JButton btnDisconnect;
	private JScrollPane scrollPane;
	private DataBaseConection DBCON;
	public FMSSErverGUI() {
		getContentPane().setLayout(null);
		lblConnecttoserver = new JLabel("ConnectToServer");
		lblConnecttoserver.setBounds(209, 0, 200, 50);
		getContentPane().add(lblConnecttoserver);
		
		lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(159, 34, 75, 50);
		usernameField = new JTextField();
		usernameField.setBounds(244, 49, 139, 20);
		getContentPane().add(lblUsername);
		getContentPane().add(usernameField);

		
		lblPassword= new JLabel("Password:");
		lblPassword.setBounds(159, 80, 66, 50);
		passwordField = new JPasswordField();
		passwordField.setBounds(244, 95, 139, 20);
		getContentPane().add(lblPassword);
		getContentPane().add(passwordField);
		
		lblDb = new JLabel("DB:");
		lblDb.setBounds(159, 126, 66, 50);
		DBtext = new JTextField();
		DBtext.setBounds(244, 141, 139, 20);
		DBtext.setText("fmsdb");
		getContentPane().add(lblDb);
		getContentPane().add(DBtext);
		
		 btnConnect = new JButton("Connect");
		 btnConnect.setBounds(145, 194, 89, 23);
		getContentPane().add(btnConnect);
		
		btnDisconnect = new JButton("disconnect");
		btnDisconnect.setBounds(300, 194, 116, 23);
		getContentPane().add(btnDisconnect);
		

		  
		  btnConnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textPane.setText("");
					if(!(usernameField.getText().equals(DBCON.GetUsername())))
					{
						textPane.setText("Username is incorrect");
						usernameField.setText(null);
					}
					else if(!(passwordField.getText().equals(DBCON.GetPassword())))
					{
						textPane.setText("Password is incorrect");
						passwordField.setText(null);
					}
					else if(!(DBtext.getText().equals(DBCON.GetDataBaseName())))
					{
						textPane.setText("DataBase doesn't exist.");
						DBtext.setText(DBCON.GetDataBaseName());
					}
					else{
					try {
							server.listen();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}		
						server.serverStarted();
						textPane.append(server.serverStartedPrint()+"\n");
						textPane.append(getIPAddress()+"\n");
					}
				}
			});
		  
			btnDisconnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					usernameField.setText(null);
					passwordField.setText(null);
					DBtext.setText(null);
					server.stopListening();
					server.serverStopped();
					textPane.setText(server.serverStoppedPrint());
				}
			});
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(119, 254, 307, 297);
			getContentPane().add(scrollPane);
			  
			   textPane = new JTextArea();
			   textPane.setEditable(false);
			  
			   scrollPane.setViewportView(textPane);
			   textPane.setBackground(Color.LIGHT_GRAY);
		
	}
	private void SetServer(FMSserver server)
	{
		this.server=server;
	}
	private void SetDataBase(DataBaseConection DBCON)
	{
		this.DBCON=DBCON;
	}
	private String getIPAddress(){
		try {
			InetAddress ip = InetAddress.getLocalHost();
			return ip.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseConection DBCON=new DataBaseConection();
		FMSSErverGUI serverGUI=new FMSSErverGUI();
		FMSserver server=new FMSserver(Integer.parseInt(DBCON.GetPort()));
		serverGUI.SetServer(server);
		serverGUI.SetDataBase(DBCON);
		serverGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverGUI.setBounds(150,150, 600, 600);
		serverGUI.setTitle("File Management System  Server");
		serverGUI.setVisible(true);

		
	}
}
