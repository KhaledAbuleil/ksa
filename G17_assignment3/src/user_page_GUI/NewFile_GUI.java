package user_page_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JList;

public class NewFile_GUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public NewFile_GUI() {
		setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 33, 46, 14);
		add(lblName);
		
		textField = new JTextField();
		textField.setBounds(65, 30, 198, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(10, 238, 46, 14);
		add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 235, 198, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Privellege");
		lblNewLabel.setBounds(10, 263, 46, 14);
		add(lblNewLabel);
		
		JComboBox comboBox_privellege = new JComboBox();
		comboBox_privellege.setBounds(65, 260, 28, 20);
		add(comboBox_privellege);
		
		JLabel lblNewLabel_1 = new JLabel("Describe");
		lblNewLabel_1.setBounds(10, 58, 46, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 61, 198, 170);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(317, 208, 89, 23);
		add(btnNewButton);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(129, 263, 46, 14);
		add(lblType);
		
		JComboBox comboBox_type = new JComboBox();
		comboBox_type.setBounds(160, 260, 28, 20);
		add(comboBox_type);
		
		JLabel lblNewLabel_2 = new JLabel("Groups");
		lblNewLabel_2.setBounds(317, 58, 46, 14);
		add(lblNewLabel_2);
	}
}
