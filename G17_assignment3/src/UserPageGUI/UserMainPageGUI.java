package UserPageGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Useroption;

import javax.swing.JTree;

public class UserMainPageGUI extends JFrame {
    public FilesSystem fs;
	private JPanel contentPane;
	public 	CreateNewFileGUI newFile ;
	public RequestFill Request;
	public  UploadFile upload;
	public GroupsManager GM;
	public JPanel panel ;
	public JLabel lbllogIIn;
	public UserMainPageGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 900, 700);
			Request= new RequestFill();
			 newFile=new CreateNewFileGUI();
			 GM=new GroupsManager();
			 fs= new FilesSystem();
		contentPane = new JPanel();
		panel= new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(0,0,700,700);
		contentPane.add(panel);
		
		JTextField textField = new JTextField();
		textField.setBounds(551, 25, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(494, 10, 200, 50);
		contentPane.add(lblSearch);
		
		 lbllogIIn = new JLabel("a");

		lbllogIIn.setBounds(756, 28, 46, 14);
		contentPane.add(lbllogIIn);

		
		JButton btnCreateFile = new JButton("Create File");
		btnCreateFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel);
				panel=newFile;
				newFile.setBounds(0,100,646,332);
				contentPane.add(panel);
				 repaint();

				
			}
		});
		btnCreateFile.setBounds(119, 21, 89, 28);
		contentPane.add(btnCreateFile);
		
		JButton btnSendRequest = new JButton("Send Request");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel);
				panel=Request;
				Request.setBounds(0,100,646,332);
				contentPane.add(panel);
				 repaint();

				
			}
		});
		btnSendRequest.setBounds(238, 21, 99, 28);
		contentPane.add(btnSendRequest);
		JButton btnSystemFile = new JButton("Files System");
		btnSystemFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel);
				panel=fs;
				fs.setBounds(0,100,646,332);
				contentPane.add(panel);
				 repaint();

			}
		});
		btnSystemFile.setBounds(369, 21, 99, 28);
		contentPane.add(btnSystemFile);
		
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(UserMainPageGUI.class.getResource("/Pictures/rsz_home.png")));
		btnHome.setBounds(29, 21, 47, 27);
		contentPane.add(btnHome);
		
		JButton btnEditGroup = new JButton("Edit Group");
		btnEditGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				contentPane.remove(panel);
				panel=GM;
				GM.setBounds(0,100,646,332);
				contentPane.add(panel);
				 repaint();
			}
		});
		btnEditGroup.setBounds(767, 113, 89, 23);
		contentPane.add(btnEditGroup);
		

	}
	
	public static void main(String[] args) {
		UserMainPageGUI g=new UserMainPageGUI();
		g.setVisible(true);


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
}
