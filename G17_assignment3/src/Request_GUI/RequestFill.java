package Request_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class RequestFill extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
   String[] A={"Retire","Join"};
	public RequestFill() {
		

		getContentPane().setLayout(null);
		
		JLabel lblRequest = new JLabel("Request");
		lblRequest.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRequest.setBounds(163, 0, 137, 52);
		getContentPane().add(lblRequest);
		
		JLabel lblGroup = new JLabel("Group");
		lblGroup.setBounds(30, 116, 46, 14);
		getContentPane().add(lblGroup);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(30, 141, 46, 14);
		getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(86, 113, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 137, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(182, 198, 89, 23);
		getContentPane().add(btnSend);
		
		JComboBox comboBox = new JComboBox(A);
		comboBox.setEditable(true);
		comboBox.setBounds(86, 85, 86, 20);	
		comboBox.setSelectedIndex(2);
		getContentPane().add(comboBox);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(30, 88, 46, 14);
		getContentPane().add(lblType);
		JPanel panel = new JPanel();
	}
}
