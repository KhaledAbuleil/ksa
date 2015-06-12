package G17Client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import java.awt.Color;


/**
 * class for the login main page frame
 * @author G6
 *
 */
public class LogInGUI extends JFrame{

	public JButton btnLogin;
	private JFrame frame;
	public JPanel panel;
	
/**
 * Get wanted panel
 * @return wanted panel
 */
	public JPanel getPanel() {
		return panel;
	}
/**
 * set panel
 * @param panel panel
 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getUserTextField() {
		return textUserName;
	}

	public void setUserTextField(JTextField userTextField) {
		this.textUserName = userTextField;
	}
/**
 * field for the name and Id
 */
	private JTextField textUserName;
	private JTextField passwordField;
	private JLabel lblFileManagementSystem;
	
	
	
	public JTextField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	public LogInGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(100, 30, 500, 500);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textUserName = new JTextField();
		textUserName.setText("client");
		textUserName.setBounds(229, 80, 114, 20);
		panel.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(128, 83, 76, 14);	
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(128, 130, 76, 14);
		panel.add(lblPassword);
		
		btnLogin = new JButton("LogIn");


		btnLogin.setBounds(173, 193, 89, 23);
		panel.add(btnLogin);
		
		passwordField = new JTextField();
		passwordField.setText("123");
		passwordField.setBounds(229, 127, 114, 17);
		panel.add(passwordField);
		passwordField.setColumns(10);
		
		lblFileManagementSystem = new JLabel("file management system");
		lblFileManagementSystem.setBounds(158, 25, 138, 14);
		panel.add(lblFileManagementSystem);
		
		
		/*btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//User newUser= new User(userTextField.getText(),passwordField.getText());
				String user;
				char[] pass;
				user = userTextField.getText();
				pass = passwordField.getPassword();
				if(userTextField.getText().equals("gawad") || passwordField.getPassword().equals('1')){
					
					System.out.print("Welcome!");
				}
				
				
			}
		});*/
		
		
	}
	
	public void addController(ActionListener controller){
		System.out.print("logIn pnl->Add controller");
		btnLogin.addActionListener(controller);
	}
}
