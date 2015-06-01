package user_page_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OLdMainPageGUI extends JFrame {
	public OLdMainPageGUI() {
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
		
		JButton btnEditFolder = new JButton("Edit Folder");
		btnEditFolder.setBounds(109, 11, 83, 23);
		userpanel.add(btnEditFolder);
		
		JButton btnCreatefile = new JButton("Create File");
		btnCreatefile.setBounds(205, 11, 85, 23);
		userpanel.add(btnCreatefile);
		
		JButton btnUpdateFile = new JButton("Update File");
		btnUpdateFile.setBounds(300, 11, 87, 23);
		userpanel.add(btnUpdateFile);
		
		JButton btnSendRequest = new JButton("Manage Groups");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSendRequest.setBounds(409, 11, 114, 23);
		userpanel.add(btnSendRequest);
		
		JButton btnAddFolder = new JButton("Add folder");
		btnAddFolder.setBounds(10, 11, 89, 23);
		userpanel.add(btnAddFolder);
		
		JPanel DenamicPanel = new JPanel();
		DenamicPanel.setBounds(20, 102, 517, 355);
		getContentPane().add(DenamicPanel);
	}

	
}
