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
import javax.swing.JPanel;

import Entity.user;
import G17Client.ClientConnectTOServer;
import G17Client.FMSClient;
import G17Client.LogInGUI;
import Message.Message;
import UserPageGUI.UserMainPageGUI;
import common.ChatIF;

import javax.swing.JButton;

public abstract class MainControler implements java.awt.event.ActionListener{
	private static final ActionListener MainControler = null;
	private static FMSClient clientConection;
	static JFrame mainFram;
	static JFrame  secondFram;
	static JPanel mainPanel ;
	static ClientConnectTOServer cctsg;
	 static ClientConnectTOServer cctsg2;
	static   ChatIF clientUI; 
	static int portInt;
	static String serverAdd = null;
	static String port="0000" ;

	public static void main(String[] args) throws IOException, InterruptedException {
		mainFram = new JFrame("Main Frame");
		mainFram.setSize(800, 700);
		mainFram.getContentPane().setLayout(null);
		mainFram.setVisible(true);
	cctsg = new ClientConnectTOServer();
	  LogInGUI LogInPage=new LogInGUI(); 

		cctsg.ServerIP.setText("192.168.56.1");
		mainPanel=cctsg.ConnectPanel;
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
		mainFram.revalidate();
		mainFram.repaint();

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
			
			TimeUnit.SECONDS.sleep(2);
			mainPanel.setVisible(false);
			mainPanel=LogInPage.panel;
			mainFram.setContentPane(mainPanel);
			mainFram.getContentPane().setLayout(null);
			mainFram.revalidate();
			mainFram.repaint();
		}		
	
	   LogInPage.addController(MainControler);
		LogInPage.btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				user Client = new user(LogInPage.getUserTextField().getText(),LogInPage.getPasswordField().getText());
				Message msg = new Message(Client,"UserLogIn");
				try {
					System.out.println("1"+LogInPage.getUserTextField().getText()+LogInPage.getPasswordField().getText());
						clientConection.sendToServer(msg);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
	}
	public static void userRole(Message msg)
	{
	 user user = (user) msg.getObj();
	 System.out.println(user.getRole());
	switch(user.getRole()){
		 case "user":
			 	mainFram.setVisible(false);
				Useroption userOp=new Useroption();//Control For UserPage
				UserMainPageGUI userPage = new UserMainPageGUI();;//The User page
				userPage.setVisible(true);
				userOp.addGuiPage(userPage);
				userPage.newFile.addController(userOp);
				//userPage.up.addController(userOp);
				//userPage.Request.addController(userOp);
				break;
	 }
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
