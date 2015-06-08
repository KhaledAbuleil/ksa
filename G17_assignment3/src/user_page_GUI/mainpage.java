package user_page_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;


public class mainpage extends JFrame {
	public mainpage() {
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
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSendRequest.setBounds(368, 11, 99, 23);
		userpanel.add(btnSendRequest);
		
		JComboBox comboBoxfolder = new JComboBox();
		comboBoxfolder.setModel(new DefaultComboBoxModel(new String[] {"Folder", "Edit Folder", "Change Name", "Delete"}));
		comboBoxfolder.setBounds(64, 12, 89, 20);
		userpanel.add(comboBoxfolder);
		
		JComboBox comboBoxfile = new JComboBox();
		comboBoxfile.setModel(new DefaultComboBoxModel(new String[] {"File", "Edit File", "Change Name"}));
		comboBoxfile.setBounds(224, 12, 83, 21);
		userpanel.add(comboBoxfile);
		
		JButton btnNewButton = new JButton("New File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(368, 47, 99, 23);
		userpanel.add(btnNewButton);
		
		JPanel DenamicPanel = new JPanel();
		DenamicPanel.setBounds(10, 102, 533, 214);
		getContentPane().add(DenamicPanel);
		DenamicPanel.setLayout(null);
	}
}
