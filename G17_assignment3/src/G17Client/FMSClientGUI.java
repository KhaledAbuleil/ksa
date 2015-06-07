package G17Client;

import javax.swing.JFrame;

import G17Server.FMSSErverGUI;
import G17Server.FMSserver;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FMSClientGUI extends JFrame  {
	private JLabel lblFileManagementSystem;
	private JLabel lblUsername;
	private JTextField usernametext;
	private JTextField textField;
	public FMSClientGUI() {
		getContentPane().setLayout(null);
		
		lblFileManagementSystem = new JLabel("file management system");
		lblFileManagementSystem.setBounds(132, 11, 150, 14);
		getContentPane().add(lblFileManagementSystem);
		
		JLabel lblUsername = new JLabel("username:");
		lblUsername.setBounds(71, 48, 73, 14);
		getContentPane().add(lblUsername);
		
		usernametext = new JTextField();
		usernametext.setBounds(142, 45, 117, 20);
		getContentPane().add(usernametext);
		usernametext.setColumns(10);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setBounds(71, 100, 73, 14);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(142, 97, 117, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(141, 140, 89, 23);
		getContentPane().add(btnLogin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		FMSClientGUI serverGUI=new FMSClientGUI();
		serverGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverGUI.setBounds(150,150, 600, 600);
		serverGUI.setTitle("File Management System  Server");
		serverGUI.setVisible(true);
	}
}
