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

public class RequestFill extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
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
		lblDate.setBounds(30, 140, 46, 14);
		getContentPane().add(lblDate);
		
		JCheckBox chckbxRetire = new JCheckBox("Retire");
		chckbxRetire.setBounds(20, 86, 86, 23);
		getContentPane().add(chckbxRetire);
		
		JCheckBox chckbxJoin = new JCheckBox("Join");
		chckbxJoin.setBounds(20, 60, 97, 23);
		getContentPane().add(chckbxJoin);
		
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
		JPanel panel = new JPanel();
	}
}
