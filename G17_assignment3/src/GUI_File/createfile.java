package GUI_File;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

public class createfile extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public createfile() {
		getContentPane().setLayout(null);
		
		JLabel lblF = new JLabel("Create File");
		lblF.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblF.setBounds(227, 11, 96, 53);
		getContentPane().add(lblF);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(24, 100, 44, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Describe");
		lblNewLabel_1.setBounds(24, 146, 44, 50);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(24, 194, 44, 50);
		getContentPane().add(lblType);
		
		textField = new JTextField();
		textField.setBounds(126, 100, 158, 35);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 154, 158, 35);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 209, 158, 35);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Create ");
		btnNewButton.setBounds(227, 317, 104, 53);
		getContentPane().add(btnNewButton);
	}
}
