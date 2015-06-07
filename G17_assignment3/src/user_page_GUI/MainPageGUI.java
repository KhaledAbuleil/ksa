package user_page_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainPageGUI extends JFrame {
	public MainPageGUI() {
		setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		JPanel Adminpanel = new JPanel();
		Adminpanel.setBounds(545, 10, 143, 447);
		getContentPane().add(Adminpanel);
		Adminpanel.setLayout(null);
		
		JButton btnEditGroup = new JButton("Edit Group");
		btnEditGroup.setBounds(38, 77, 95, 23);
		Adminpanel.add(btnEditGroup);
		
		JButton btnEditUser = new JButton("Edit User");
		btnEditUser.setBounds(38, 127, 101, 23);
		Adminpanel.add(btnEditUser);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.setBounds(38, 179, 101, 23);
		Adminpanel.add(btnSendMessage);
		
		JPanel userpanel = new JPanel();
		userpanel.setBounds(10, 10, 533, 81);
		getContentPane().add(userpanel);
		userpanel.setLayout(null);
		
		JButton btnEditFolder = new JButton("File");
		btnEditFolder.setBounds(227, 11, 83, 23);
		userpanel.add(btnEditFolder);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.setBounds(368, 11, 99, 23);
		userpanel.add(btnSendRequest);
		
		JButton btnAddFolder = new JButton("Folder");
		btnAddFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddFolder.setBounds(95, 11, 89, 23);
		userpanel.add(btnAddFolder);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(95, 36, 89, 20);
		userpanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(227, 35, 83, 21);
		userpanel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("New File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(368, 45, 99, 23);
		userpanel.add(btnNewButton);
		
		JPanel DenamicPanel = new JPanel();
		DenamicPanel.setBounds(10, 102, 533, 214);
		getContentPane().add(DenamicPanel);
		DenamicPanel.setLayout(null);
	}
}
