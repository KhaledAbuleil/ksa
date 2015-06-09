package controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import UserPageGUI.FilesSystem;
import UserPageGUI.RequestFill;
import UserPageGUI.UploadFile;
import UserPageGUI.UserMainPageGUI;
import controller.MainControler;
import Entity.MyFile;
import Entity.request;
import Entity.user;
import Entity.userfiles;
import G17Client.ClientConnectTOServer;
import G17Client.FMSClient;
import Message.Message;
public class Useroption implements java.awt.event.ActionListener{
	private static final ActionListener Useroption = null;
	private static UserMainPageGUI UserPage;
	private Object request;
	private static UserPageGUI.RequestFill RequestFill ;
	static  FMSClient clientConection;
	private userfiles[] filsys;
	
	public Useroption(){
		if(clientConection == null)
		{
		clientConection = MainControler.getInstance();
		System.out.println("Useroption:->"+"Add new clientConection ");
		}
		else
		System.out.println("Useroption:->"+"clientConection is OK");
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		/**
		 * switch to the relevant case to send to the server.
		 */
		switch (e.getActionCommand()) 
		{
		case ("Upload File"):
			  MyFile names= new MyFile();
			UserPage.upload=new UploadFile();
		UserPage.newFile.Location.setText(UserPage.upload.SelectedPath());
	
		  Message msg = new Message(names,"Get the files name");
			try {
				clientConection.sendToServer(msg);
			} catch (IOException e2) {
				System.out.println("UserOPtion->Can not get Arraylist");
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}	
 			 break;
		case ("Save"):
				if((UserPage.newFile.TheFileName.getText()).equals(""))
						JOptionPane.showMessageDialog(UserPage, "insert a file name");
				else
			if((UserPage.newFile.DescribeField.getText()).equals(""))
					JOptionPane.showMessageDialog(UserPage, "insert a File Describe ");
			else
				if((CheckInput.checkInput.CheckDescribe((UserPage.newFile.DescribeField.getText())))>30)
				JOptionPane.showMessageDialog(UserPage, "the file describtion must be less than 30 words ");
				else
				if(UserPage.upload.SelectedPath()==null)
					JOptionPane.showMessageDialog(UserPage,"upload a file");
				else
					if(CheckInput.checkInput.CheckTheFileName(UserPage.newFile.TheFileName.getText()))
					{
						JOptionPane.showMessageDialog(UserPage,"insert another name");
					}
				else{
	 			  MyFile CreateFile= new MyFile();
	 			  try{
	 				 System.out.println(UserPage.upload.SelectedPath()) ;  
	 				      File newFile = new File (UserPage.upload.SelectedPath());
	 				     System.out.println("useroption->"+"the file path"+UserPage.upload.SelectedPath()) ;  
	 				      byte [] mybytearray  = new byte [(int)newFile.length()];
	 				      FileInputStream fis = new FileInputStream(newFile);
	 				     BufferedInputStream bis = new BufferedInputStream(fis);			  
	 				    CreateFile.SetOwner(UserPage.lbllogIIn.getText());
	 				    CreateFile.initArray(mybytearray.length);
	 				   CreateFile.setPhysicleAdd(UserPage.upload.SelectedPath());
	 				    CreateFile.setSize(mybytearray.length);
	 				     CreateFile.setFname(UserPage.newFile.TheFileName.getText());
	 				    CreateFile.setType(UserPage.upload.getFileType());
	 				   CreateFile.setDescribe(UserPage.newFile.DescribeField.getText());
	 				  CreateFile.setPrivilege(Integer.parseInt(UserPage.newFile.comboBox_privellege.getSelectedItem().toString()));
	 				      msg = new Message(CreateFile,"Create File");
	 				    bis.read(CreateFile.getMybytearray(),0,mybytearray.length);
	 				    clientConection.sendToServer(msg);		      
	 				    }
	 				catch (Exception e1) {
	 					System.out.println("Error send (Files)msg) to Server");
	 					e1.printStackTrace();
	 				}
				}
				 break;
		case ("Send"):
		{
			if((UserPage.Request.GroupTxt.getText()).equals(""))
				JOptionPane.showMessageDialog(UserPage, "insert a Group Name");
			request user_request=new request();
			user_request.setRname(UserPage.Request.GroupTxt.getText());
			user_request.setRtype(UserPage.Request.type.getSelectedItem().toString());
		      msg = new Message(user_request,"send request");
		    try {
				clientConection.sendToServer(msg);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("useroption->send request error");
			}	
		    break;
		    }
			case("2"):
				user username=new user();
			username.setUsername(UserPage.lbllogIIn.getText());
				msg = new Message(username,"2");
			try {
				clientConection.sendToServer(msg);
			} catch (IOException e1) {
				System.out.println("Useroption->selected privellege is 2");
				e1.printStackTrace();
			}
				break;
			case ("Files System"):
				
			{
             FilesSystem filesys = new FilesSystem(filsys);
             msg = new Message(filesys,"Files System");
				try {
					clientConection.sendToServer(msg);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("creat system files error");
				}	
			    break;
			}

 			}
 		
		}
	
	public static  void showInPanl(Message msg)
	{
		ArrayList<String> arr = new ArrayList<String>((ArrayList<String>) msg.getArrList());
		 
	}
	public static void setfilessystem(Message msg){
		userfiles[] filsys=(msg.getuserfiles());

	}
	public void addGuiPage( UserMainPageGUI userPage)
	{
		this.UserPage=userPage;
		
	}
}