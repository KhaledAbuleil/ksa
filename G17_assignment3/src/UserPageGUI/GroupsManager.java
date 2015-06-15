package UserPageGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class GroupsManager extends JFrame {
	public GroupsManager() {
		
		
		getContentPane().setLayout(null);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.setBounds(0, 0, 99, 23);
		getContentPane().add(btnSendRequest);
		
		JButton button = new JButton("<--");
		button.setBounds(98, 0, 49, 23);
		getContentPane().add(button);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(395, 0, 39, 23);
		getContentPane().add(btnX);
		
		JButton btnInboxMsg = new JButton("Inbox Msg");
		btnInboxMsg.setBounds(146, 0, 89, 23);
		getContentPane().add(btnInboxMsg);
		JPanel panel = new JPanel();
	}

}
