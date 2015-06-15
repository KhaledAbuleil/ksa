package user_page_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JLabel;


public class UserMainPageGUI extends JFrame {
	public	 JPanel denamicPanel;
	private JButton btnCreateFile;
	private JButton btnEditFile;
	public  NewFile_GUI CreateNewFile;
	
	public UserMainPageGUI() {
		CreateNewFile=new NewFile_GUI();
		getContentPane().setLayout(null);
		denamicPanel.setBounds(10, 187, 810, 204);
		denamicPanel=CreateNewFile;
		getContentPane().add(denamicPanel);
		
		btnCreateFile = new JButton("Create File");
		btnCreateFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnCreateFile.setBounds(20, 67, 119, 23);
		getContentPane().add(btnCreateFile);
		
		btnEditFile = new JButton("Edit File");
		btnEditFile.setBounds(182, 67, 89, 23);
		getContentPane().add(btnEditFile);
	}

}
