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

public class CreateNewFileGUI extends JPanel {
	public JTextField TheFileName;
	public JTextField textField_1;
	private JTable table;
	public  JButton btnUploadfile;
	public  JButton btnSaveButton;
	public JComboBox comboBox_privellege;
	public TextArea DescribeField;
	public CreateNewFileGUI() {
		setLayout(null);
		setSize(646,332);
		JLabel lblName = new JLabel("Name");
		add(lblName);
		
		TheFileName = new JTextField();
		TheFileName.setBounds(161, 30, 196, 20);
		add(TheFileName);
		TheFileName.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(105, 238, 46, 14);
		add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 235, 206, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Privellege");
		lblNewLabel.setBounds(271, 266, 46, 14);
		add(lblNewLabel);
		
		 comboBox_privellege = new JComboBox();
		comboBox_privellege.setModel(new DefaultComboBoxModel(new String[] {"3", "1", "2"}));
		comboBox_privellege.setBounds(342, 260, 46, 20);
		add(comboBox_privellege);
		
		JLabel lblNewLabel_1 = new JLabel("Describe");
		lblNewLabel_1.setBounds(105, 61, 46, 14);
		add(lblNewLabel_1);
		
		 btnSaveButton = new JButton("Save");

		btnSaveButton.setBounds(462, 262, 89, 23);
		add(btnSaveButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(370, 60, 179, 188);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnGroups = new JButton("Groups");
		btnGroups.setBounds(489, 29, 89, 23);
		add(btnGroups);
		
		 btnUploadfile = new JButton("Upload File");
		btnUploadfile.setBounds(370, 29, 89, 23);
		add(btnUploadfile);
		
		Label label = new Label("File Name");
		label.setBounds(105, 28, 51, 22);
		add(label);
		
		 DescribeField = new TextArea();
		DescribeField.setBounds(161, 56, 196, 160);
		add(DescribeField);
		

		
		

	}

	public  void addController(ActionListener controller) {
		System.out.print("mainpage pnl->newfiler");
		btnSaveButton.addActionListener(controller);
		btnUploadfile.addActionListener(controller);
	
	
	}
	}
