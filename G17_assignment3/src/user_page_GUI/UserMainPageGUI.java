package user_page_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class UserMainPageGUI extends JFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainPageGUI window = new UserMainPageGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserMainPageGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreateFile = new JButton("Create File");
		btnCreateFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewFileGUI newFile = new NewFileGUI();
				
				newFile.setBounds(100, 100, 776, 394);
				frame.getContentPane().add(newFile);
				
			}
		});
		btnCreateFile.setBounds(119, 21, 89, 28);
		frame.getContentPane().add(btnCreateFile);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RequestFill ReqRequestFilluest = new RequestFill();
				//newFile.setVisible(false);
				ReqRequestFilluest.setBounds(100, 100, 776, 394);
				frame.getContentPane().add(ReqRequestFilluest);
				
			}
		});
		btnSendRequest.setBounds(238, 21, 99, 28);
		frame.getContentPane().add(btnSendRequest);
		
		JTree tree = new JTree();
		tree.setBounds(10, 95, 177, 261);
		frame.getContentPane().add(tree);
		
		JButton btnSystemFile = new JButton("System File");
		btnSystemFile.setBounds(369, 21, 99, 28);
		frame.getContentPane().add(btnSystemFile);
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(UserMainPageGUI.class.getResource("/Pictures/rsz_home.png")));
		btnHome.setBounds(29, 21, 47, 27);
		frame.getContentPane().add(btnHome);
		
		textField = new JTextField();
		textField.setBounds(551, 25, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(494, 10, 200, 50);
		frame.getContentPane().add(lblSearch);
	}
}
