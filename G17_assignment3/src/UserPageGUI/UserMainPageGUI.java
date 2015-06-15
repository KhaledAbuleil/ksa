package UserPageGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserMainPageGUI extends JFrame {

	private JPanel contentPane;
	private 	CreateNewFileGUI newFile ;
	private RequestFill Request;
		public UserMainPageGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(100, 100, 776, 500);
		JButton btnCreateFile = new JButton("Create File");
		btnCreateFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 newFile = new CreateNewFileGUI();
				newFile.setBounds(100, 100, 776, 394);
				contentPane.add(newFile);
				 repaint();
				
			}
		});
		btnCreateFile.setBounds(119, 21, 89, 28);
		contentPane.add(btnCreateFile);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 Request = new RequestFill();
				newFile.setVisible(false);
				Request.setBounds(100, 100, 776, 394);
				contentPane.add(Request);
				
			}
		});
		btnSendRequest.setBounds(238, 21, 99, 28);
		contentPane.add(btnSendRequest);
		
		JButton btnSystemFile = new JButton("System File");
		btnSystemFile.setBounds(369, 21, 99, 28);
		contentPane.add(btnSystemFile);
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(UserMainPageGUI.class.getResource("/Pictures/rsz_home.png")));
		btnHome.setBounds(29, 21, 47, 27);
		contentPane.add(btnHome);
		
		JTextField textField = new JTextField();
		textField.setBounds(551, 25, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(494, 10, 200, 50);
		contentPane.add(lblSearch);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainPageGUI frame = new UserMainPageGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
