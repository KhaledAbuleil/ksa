package user_page_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Entity.user;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import java.awt.Color;


/**
 * class for the LogIn main page frame
 * @author G6
 *
 */
public class LogIn extends JFrame{

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
	
	
	
	public JTextField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
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
		panel.setBackground(Color.GRAY);
		panel.setBounds(22, 11, 487, 278);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textUserName = new JTextField();
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
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnLogin.setBounds(173, 193, 89, 23);
		panel.add(btnLogin);
		
		passwordField = new JTextField();
		passwordField.setBounds(229, 127, 114, 17);
		panel.add(passwordField);
		passwordField.setColumns(10);
		
		
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