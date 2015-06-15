package G17Client;


import javax.swing.JFrame;

import G17Server.FMSSErverGUI;
import G17Server.FMSserver;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.text.JTextComponent;
import javax.swing.JPanel;

import G17Client.LogInGUI;

public class ClientConnectTOServer extends JFrame  {
	private JLabel lblFileManagementSystem;
	private JLabel lblUsername;
	public JTextField ServerIP;
	public JTextField ServerPort;
	public JTextArea textPane;
	private FMSClient client;
	private LogInGUI loginclient;
	 public JButton btnConnect ;
		public JPanel ConnectPanel;
		private JPanel panel;
		
	public ClientConnectTOServer() {
		ConnectPanel = new JPanel();
		ConnectPanel.setBounds(100, 30, 500, 500);
		ConnectPanel.setLayout(null);
		
		lblFileManagementSystem = new JLabel("file management system");
		lblFileManagementSystem.setBounds(190, 23, 157, 14);
		ConnectPanel.add(lblFileManagementSystem);
		
		JLabel lblServerIP = new JLabel("ServerIP:");
		lblServerIP.setBounds(135, 78, 62, 14);
		ConnectPanel.add(lblServerIP);
		
		ServerIP = new JTextField();
		ServerIP.setText("192.168.13.126");
		ServerIP.setBounds(250, 75, 116, 20);
		ConnectPanel.add(ServerIP);
		ServerIP.setColumns(10);
		
		JLabel lblServerPort = new JLabel("ServerPort :");
		lblServerPort.setBounds(135, 117, 105, 14);
		ConnectPanel.add(lblServerPort);
		
		ServerPort = new JTextField();
		ServerPort.setBounds(250, 114, 116, 20);
		ServerPort.setText("4444");
		ConnectPanel.add(ServerPort);
		ServerPort.setColumns(10);
		
		 btnConnect = new JButton("Connect");
		 btnConnect.setBounds(124, 178, 73, 23);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 234, 321, 305);
		ConnectPanel.add(scrollPane);
		
		   textPane = new JTextArea();
		  scrollPane.setViewportView(textPane);
		  textPane.setEditable(false);
		  textPane.setBackground(Color.LIGHT_GRAY);
		ConnectPanel.add(btnConnect);
	
	}
	public void setClient(FMSClient client)
	{
		this.client=client;
	}
}
