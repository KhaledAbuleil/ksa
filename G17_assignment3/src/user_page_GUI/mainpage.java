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


public class mainpage extends JFrame {
	public JPanel mainpanel;
	public JPanel userpanel;
	public JPanel adminpanel;
	public JPanel denamic;
	private JTree tree;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	public mainpage() {
		
		getContentPane().setLayout(null);
		mainpanel = new JPanel();
		mainpanel.setBounds(10, 0, 935, 647);
		getContentPane().add(mainpanel);
		mainpanel.setLayout(null);
		
		userpanel= new JPanel();
		userpanel.setBounds(10, 11, 904, 114);
		mainpanel.add(userpanel);
		
		btnNewButton = new JButton("New button");
		userpanel.add(btnNewButton);
		
		 adminpanel = new JPanel();
		adminpanel.setBounds(705, 136, 220, 477);
		mainpanel.add(adminpanel);
		
		btnNewButton_1 = new JButton("New button");
		adminpanel.add(btnNewButton_1);
		
		denamic = new JPanel();
		denamic.setBounds(28, 136, 667, 477);
		mainpanel.add(denamic);
		denamic.setLayout(null);
		
		tree = new JTree();
		tree.setBounds(0, 0, 203, 424);
		denamic.add(tree);
	}
}
