package UserPageGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JFileChooser;

import controller.Useroption;
import G17Server.DataBaseConection;
import G17Server.FMSSErverGUI;
import G17Server.FMSserver;

import java.io.File;
import java.awt.Label;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.TextArea;
import java.awt.Color;

import javax.swing.JTree;
import javax.swing.JCheckBox;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
/**
  *this class is used to generate a GUI page that 
  *This page is responsible for 
  *Create a new File,insert details and upload it
  *
 * @author saeed,khaled,anita
 *
 */
public class CreateNewFileGUI extends JPanel {
	public JTextField TheFileName;
	public JTextField Location;//show the file location  from the client 
	public  JButton btnUploadfile;
	public  JButton btnSaveButton;
	public JComboBox comboBox_privellege;
	public TextArea DescribeField;
	private JTree tree_1;
	private JTree tree;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Default Constructor,which Constructs 
	 * a panel for Creating a new File
	 */
	public CreateNewFileGUI() {
		setLayout(null);
		setSize(646,332);
		JLabel lblName = new JLabel("Name");
		add(lblName);
		
		TheFileName = new JTextField();
		TheFileName.setBounds(115, 30, 236, 20);
		add(TheFileName);
		TheFileName.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(78, 238, 46, 14);
		add(lblLocation);
		
		Location = new JTextField();
		Location.setBackground(Color.WHITE);
		Location.setForeground(Color.RED);
		Location.setEnabled(false);
		Location.setEditable(false);
		Location.setBounds(134, 235, 149, 20);
		add(Location);
		Location.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Privellege");
		lblNewLabel.setBounds(78, 278, 46, 14);
		add(lblNewLabel);
		
		 comboBox_privellege = new JComboBox();
		comboBox_privellege.setModel(new DefaultComboBoxModel(new String[] {"3", "1", "2"}));
		comboBox_privellege.setBounds(171, 275, 46, 20);
		
		add(comboBox_privellege);
		
		JLabel lblNewLabel_1 = new JLabel("Describe");
		lblNewLabel_1.setBounds(39, 61, 60, 14);
		add(lblNewLabel_1);
		
		 btnSaveButton = new JButton("Save");

		btnSaveButton.setBounds(282, 274, 89, 23);
		add(btnSaveButton);
		
		 btnUploadfile = new JButton("Upload File");
		btnUploadfile.setBounds(282, 234, 89, 23);
		add(btnUploadfile);
		
		Label label = new Label("File Name");
		label.setBounds(39, 28, 60, 22);
		add(label);
		
		 DescribeField = new TextArea();
		DescribeField.setBounds(115, 56, 244, 176);
		add(DescribeField);
		


		
		
		

	}

	public  void addController(ActionListener controller) {
		System.out.print("mainpage pnl->newfiler");
		btnSaveButton.addActionListener(controller);
		btnUploadfile.addActionListener(controller);
		comboBox_privellege.addActionListener(controller);
	
	}
	}
