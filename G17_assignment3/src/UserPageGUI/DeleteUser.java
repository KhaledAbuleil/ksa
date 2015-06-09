package UserPageGUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class DeleteUser extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public DeleteUser() {
		setLayout(null);
		
		JLabel lblUsername = new JLabel("userName");
		lblUsername.setBounds(86, 279, 75, 14);
		add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(158, 276, 123, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblGroupname = new JLabel("groupName :");
		lblGroupname.setBounds(86, 332, 75, 14);
		add(lblGroupname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 329, 118, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 112, 378, 113);
		add(panel);
		
		JLabel lblAddremoveUser = new JLabel("add user");
		lblAddremoveUser.setBounds(172, 11, 49, 14);
		add(lblAddremoveUser);
		
		JButton btnGetusername = new JButton("Get Request");
		btnGetusername.setBounds(139, 54, 118, 23);
		add(btnGetusername);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(173, 361, 89, 23);
		add(btnAdd);

	}
}
