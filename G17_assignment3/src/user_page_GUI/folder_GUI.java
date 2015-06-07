package user_page_GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class folder_GUI extends JFrame{
	public folder_GUI() {
		getContentPane().setLayout(null);
		
		JButton btnChangeName = new JButton("Change Name");
		btnChangeName.setBounds(10, 21, 129, 23);
		getContentPane().add(btnChangeName);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 59, 129, 23);
		getContentPane().add(btnNewButton);
	}
}
