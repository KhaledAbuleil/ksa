package UserPageGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupsManager extends JPanel {
	public addUser add;
	public DeleteUser remove;
	public JPanel panel;
	public JPanel CentrlPn;
	public GroupsManager() {
		add=new addUser();
		remove=new DeleteUser();
		panel=new JPanel();
		panel.setBounds(10, 60, 414, 191);
		CentrlPn=new JPanel();
		CentrlPn.setBounds(10, 60, 414, 191);
		CentrlPn.add(panel);
		setLayout(null);
		
		JPanel CenterPnl = new JPanel();
		CenterPnl.setBounds(0, 0, 566, 358);
		add(CenterPnl);
		CenterPnl.setLayout(null);
		
		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Add", "Remove"}));
		comboBox.setBounds(145, 11, 107, 20);
		CenterPnl.add(comboBox);
		
		 panel = new JPanel();
		panel.setBounds(21, 36, 535, 300);
		CenterPnl.add(panel);


		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	             JComboBox combo = (JComboBox)e.getSource();
                 String currentQuantity = (String)combo.getSelectedItem();
				switch(currentQuantity)
				{
				case "Add":
					System.out.println("add");
					CenterPnl.remove(panel);
					panel=add;
					add.setBounds(0,100,646,332);
					CenterPnl.add(panel);
					 repaint();
					 break;
				case "Remove":
					System.out.println("Remove");
					CenterPnl.remove(panel);
					panel=remove;
					remove.setBounds(0,100,646,332);
					CenterPnl.add(panel);
					 repaint();
					 break;
				case "":
					CenterPnl.remove(panel);
					 repaint();
					 break;
				}

			}
		});
	}

}
/*
 package UserPageGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupsManager extends JPanel {
	public addUser add;
	public DeleteUser remove;
	public JPanel panel;
	public JPanel CentrlPn;
	public GroupsManager() {
		add=new addUser();
		remove=new DeleteUser();
		panel=new JPanel();
		panel.setBounds(10, 60, 414, 191);
		CentrlPn.add(panel);
		setLayout(null);
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.setBounds(0, 0, 99, 23);
		add(btnSendRequest);
		
		JButton button = new JButton("<--");
		button.setBounds(98, 0, 49, 23);
		add(button);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(395, 0, 39, 23);
		add(btnX);
		
		JButton btnInboxMsg = new JButton("Inbox Msg");
		btnInboxMsg.setBounds(146, 0, 89, 23);
		add(btnInboxMsg);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(177, 34, 73, 20);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	             JComboBox combo = (JComboBox)e.getSource();
                 String currentQuantity = (String)combo.getSelectedItem();
				switch(currentQuantity)
				{
				case "add":
					System.out.println("add");
					//panel.removeAll();
					panel=add;
					 repaint();
					 break;
				case "Remove":
					System.out.println("Remove");
					//panel.removeAll();
					panel.add(add);
					 repaint();
					 break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"add", "Remove"}));
		add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 23, 430, 186);
		add(panel_1);


	
	}

}
*/
