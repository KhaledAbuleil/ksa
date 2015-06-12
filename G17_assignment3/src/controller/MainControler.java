package controller;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

import Entity.request;
import Entity.user;
import G17Client.ClientConnectTOServer;
import G17Client.FMSClient;
import user_page_GUI.mainpage;
import G17Client.LogInGUI;
import Message.Message;
import Request_GUI.RequestFill;
import G17Client.FMSClient;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.Size;

import common.ChatIF;

import javax.swing.JButton;

public abstract class MainControler implements java.awt.event.ActionListener{
	private static final ActionListener MainControler = null;
	private static FMSClient clientConection;
	static JFrame mainFram;
	static JPanel mainPanel ;
	static ClientConnectTOServer cctsg;
	static   ChatIF clientUI; 
	static int portInt;
	static String serverAdd = null;
	static String port="0000" ;
	private static LogInGUI LogInPage; 

	public static void main(String[] args) throws IOException, InterruptedException {
		mainFram = new JFrame("Main Frame");
		mainFram.setSize(800, 700);
		mainFram.setVisible(true);
		cctsg = new ClientConnectTOServer();
		mainPanel = cctsg.ConnectPanel;
		mainFram.setContentPane(mainPanel);
		mainFram.getContentPane().setLayout(null);
		cctsg.btnConnect.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		
					port = cctsg.ServerPort.getText();
					serverAdd = cctsg.ServerIP.getText();	
					cctsg.textPane.append(port+"\n");
					cctsg.textPane.append(serverAdd+"\n");
			 	}
			 });

		/**+
		 * connect to Server.
		 */
		
		try {
			while(serverAdd ==null){
				Thread.sleep(1000);
			}
			portInt = Integer.parseInt(port);
			 
			getInstance();

		} catch (Exception e) {
			cctsg.textPane.append("Thread sleep erorr in MainControlrt");
			System.out.println(e.getMessage());
		}
		

		if(clientConection != null){
			LogInPage = new LogInGUI();
			TimeUnit.SECONDS.sleep(2);
			mainPanel=LogInPage.panel;
			mainFram.setContentPane(mainPanel);
			mainFram.getContentPane().setLayout(null);
		}		
	
	   LogInPage.addController(MainControler);
		LogInPage.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user Client = new user(LogInPage.getUserTextField().getText(),LogInPage.getPasswordField().getText());
				Message msg = new Message(Client,"UserLogIn");
				try {
					clientConection.sendToServer(msg);
				} catch (IOException e1) {
					System.out.println("mainControlee");
					e1.printStackTrace();
				}
			}
		});
	}	
	

	public static FMSClient getInstance() {
		if (clientConection == null)
			try {
				clientConection = new FMSClient(serverAdd, portInt,cctsg);
			} catch (IOException e) {
				cctsg.textPane.append("Could not getInstance  in MainControlrt");
				e.printStackTrace();
			}
		return clientConection;
	}


}
