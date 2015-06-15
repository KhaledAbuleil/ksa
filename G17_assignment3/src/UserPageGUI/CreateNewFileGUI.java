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

import G17Server.DataBaseConection;
import G17Server.FMSSErverGUI;
import G17Server.FMSserver;

import java.io.File;

public class CreateNewFileGUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	public static JButton btnUploadfile;
	public static JButton btnSaveButton;
	public CreateNewFileGUI() {
		setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 33, 46, 14);
		add(lblName);
		
		textField = new JTextField();
		textField.setBounds(65, 30, 107, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(10, 238, 46, 14);
		add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 235, 198, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Privellege");
		lblNewLabel.setBounds(10, 263, 46, 14);
		add(lblNewLabel);
		
		JComboBox comboBox_privellege = new JComboBox();
		comboBox_privellege.setModel(new DefaultComboBoxModel(new String[] {"3", "1", "2"}));
		comboBox_privellege.setBounds(65, 260, 46, 20);
		add(comboBox_privellege);
		
		JLabel lblNewLabel_1 = new JLabel("Describe");
		lblNewLabel_1.setBounds(10, 58, 46, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 61, 198, 170);
		add(textField_2);
		textField_2.setColumns(10);
		
		 btnSaveButton = new JButton("Save");
		btnSaveButton.setBounds(324, 270, 89, 23);
		add(btnSaveButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(285, 62, 263, 188);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnGroups = new JButton("Groups");
		btnGroups.setBounds(296, 29, 89, 23);
		add(btnGroups);
		
		 btnUploadfile = new JButton("UploadFile");
		btnUploadfile.setBounds(182, 29, 89, 23);
		add(btnUploadfile);
	}

	public static void addController(ActionListener controller) {
		System.out.print("mainpage pnl->newfiler");
		btnSaveButton.addActionListener(controller);
		btnUploadfile.addActionListener(controller);
	}
	}
