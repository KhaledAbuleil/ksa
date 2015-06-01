package user_page_GUI;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class folder_GUI extends JFrame{
	public folder_GUI() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnDeleteFile = new JButton("Delete File");
		btnDeleteFile.setBounds(263, 0, 89, 23);
		getContentPane().add(btnDeleteFile);
		
		JButton btnUpdateFile = new JButton("Update File");
		btnUpdateFile.setBounds(172, 0, 89, 23);
		getContentPane().add(btnUpdateFile);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 762, 478);
		getContentPane().add(panel);
		
		JButton btnBack = new JButton("<--");
		btnBack.setBounds(95, 0, 73, 23);
		getContentPane().add(btnBack);
		
		JButton btnCloseFolder = new JButton("X");
		btnCloseFolder.setBounds(723, 0, 39, 23);
		getContentPane().add(btnCloseFolder);
		
		JPanel Adminpanel = new JPanel();
	}
}
