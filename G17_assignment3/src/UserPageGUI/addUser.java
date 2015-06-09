package UserPageGUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class addUser extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public addUser() {
		setLayout(null);
		setVisible(true);
		JLabel lblUsername = new JLabel("userName");
		lblUsername.setBounds(86, 212, 75, 14);
		add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(175, 209, 123, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblGroupname = new JLabel("groupName :");
		lblGroupname.setBounds(86, 256, 75, 14);
		add(lblGroupname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 253, 118, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 73, 378, 113);
		add(panel);
		
		JLabel lblAddremoveUser = new JLabel("add user");
		lblAddremoveUser.setBounds(172, 11, 49, 14);
		add(lblAddremoveUser);
		
		JButton btnGetusername = new JButton("Get Request");
		btnGetusername.setBounds(138, 36, 118, 23);
		add(btnGetusername);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(138, 296, 89, 23);
		add(btnAdd);

	}
}
