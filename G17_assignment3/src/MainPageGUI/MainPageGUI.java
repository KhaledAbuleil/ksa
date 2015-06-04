package MainPageGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class MainPageGUI extends JFrame {
	public MainPageGUI() {
		getContentPane().setLayout(null);
		
		JPanel Adminpanel = new JPanel();
		Adminpanel.setBounds(571, 94, 117, 363);
		getContentPane().add(Adminpanel);
		Adminpanel.setLayout(null);
		
		JButton btnEditGroup = new JButton("Edit Group");
		btnEditGroup.setBounds(10, 93, 95, 23);
		Adminpanel.add(btnEditGroup);
		
		JButton btnEditUser = new JButton("Edit User");
		btnEditUser.setBounds(10, 147, 101, 23);
		Adminpanel.add(btnEditUser);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.setBounds(10, 198, 101, 23);
		Adminpanel.add(btnSendMessage);
		
		JPanel userpanel = new JPanel();
		userpanel.setBounds(20, 11, 678, 81);
		getContentPane().add(userpanel);
		userpanel.setLayout(null);
		
		JButton btnEditFolder = new JButton("Edit Folder");
		btnEditFolder.setBounds(10, 11, 83, 23);
		userpanel.add(btnEditFolder);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.setBounds(235, 11, 111, 23);
		userpanel.add(btnSendRequest);
		
		JButton btnEditFile = new JButton("Edit File");
		btnEditFile.setBounds(117, 11, 89, 23);
		userpanel.add(btnEditFile);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(478, -3, 200, 50);
		userpanel.add(lblUsername);
		lblUsername.setVisible(false);
		
		JPanel MessagePanel = new JPanel();
		MessagePanel.setBounds(20, 162, 548, 295);
		getContentPane().add(MessagePanel);
		
		JPanel DenamicPanel = new JPanel();
		DenamicPanel.setBounds(20, 94, 548, 69);
		getContentPane().add(DenamicPanel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
