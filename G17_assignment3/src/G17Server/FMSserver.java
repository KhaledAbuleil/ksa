package G17Server;
// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.MyFile;
import Entity.request;
import Entity.user;
import Entity.userfiles;
import Message.Message;
import SQLServices.*;
import ocsf.server.*;

/**
 * This class overrides some of the methods in the abstract 
 * superclass in order to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */
public class FMSserver extends AbstractServer 
{
  //Class variables *************************************************
  
  /**
   * The default port to listen on.
   */
  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the echo server.
   *
   * @param port The port number to connect on.
   */
	  private FMSSErverGUI serverUI;
  public FMSserver(FMSSErverGUI serverUI) 
  {
	  super();
	  this.serverUI = serverUI;
	  serverUI.setVisible(true);
  }

  
  //Instance methods ************************************************
  
  /**
   * This method handles any messages received from the client.
   *
   * @param msg The message received from the client.
   * @param client The connection from which the message originated.
   */
  public void handleMessageFromClient
  (Object msg, ConnectionToClient client)
{
	  Message clientMsg = (Message)msg;
	  	switch(clientMsg.getMsg()){
						case "UserLogIn":
							try {
								userLogIn(clientMsg);				
								break;
								} catch (SQLException e) {
								e.printStackTrace();
								}
							break;
						case "Create File":
							try {
								CreateFile(clientMsg);				
								break;
								} catch (SQLException e) {
								e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						case "Get the files name":
						{
							ArrayList<String> ls=new ArrayList<String>();
							try {
								ls=GetfileName(clientMsg);
							} catch (SQLException e) {
								System.out.println("FMSServer->Cannot get array");
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							clientMsg.setArrList(ls);

							
							break;
						}
						case "send request":
						{
							SendRequest (clientMsg);
							break;
						}
						case "2":
						{
							Group2(clientMsg);
							break;
						}
						case "Files System":
						{
							userfiles[] fileslist = new userfiles[2];
							try {
								fileslist =getFileslist(clientMsg);
							} catch (SQLException e) {
								System.out.println("FMSServer->Cannot get array");
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							clientMsg.setuserfiles(fileslist);

							
							break;
						}

							
				
			}
try {
	client.sendToClient(clientMsg);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

    




/**
   * This method overrides the one in the superclass.  Called
   * when the server starts listening for connections.
   */
  protected void serverStarted()
  {
    System.out.println
      ("Server listening for connections on port " + getPort());
  }
  
  /**
   * This method overrides the one in the superclass.  Called
   * when the server stops listening for connections.
   */
  protected void serverStopped()
  {
    System.out.println
      ("Server has stopped listening for connections.");
  }


public String serverStartedPrint() {
	// TODO Auto-generated method stub
	return ("Server listening for connections on port " + getPort());
}


public String serverStoppedPrint() {
	// TODO Auto-generated method stub
	return  ("Server has stopped listening for connections.");
}

public void userLogIn(Message msg) throws SQLException {
	user user = (user) msg.getObj();
	user= UserServices.getUser(user.getUsername(), user.getPassword());
	if(user == null)
	{
		msg.setObj(null);
	}
	else
	{
		msg.setObj(user);
	msg.setStatus(true);
	msg.setStatusMsg("done");
	}
 }
private void CreateFile(Message msg)throws SQLException, IOException {
	// TODO Auto-generated method stub
	MyFile file = (MyFile) msg.getObj();
	SQLServices.fileSQLServices.InsertNewFile(file);
	ArrayList<String>list=fileSQLServices.GetFileName();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)==file.getFname())
			return;
	}
    byte [] mybytearray  = new byte [file.getSize()];
    FileOutputStream fos = new FileOutputStream("D:\\ASS2git\\ksa\\G17_assignment3\\FMS\\"+file.getFname()+"."+file.getType());
    fos.write(file.getMybytearray());	 
	
	}	
private void SendRequest (Message msg) 
{
	request myrequest=(request) msg.getObj();
	
}
private ArrayList<String> GetfileName(Message msg) throws SQLException
{
	 
ArrayList<String> lst=null;
lst=new ArrayList<String>(SQLServices.fileSQLServices.GetFileName());
return lst;
} 
private userfiles[] getFileslist(Message msg) throws SQLException
{
	 
	userfiles[] lst=null;
lst=(userfiles[])(SQLServices.fileSQLServices.getfileslist());
return lst;
} 

private void Group2(Message clientMsg) {
	// TODO Auto-generated method stub
	user username = (user) clientMsg.getObj();
	ArrayList<String> lst=null;
	lst=new ArrayList<String>(SQLServices.GroupSQLServices.getGroupsName(
	SQLServices.GroupSQLServices.getGroupsNum(username.getUsername())));
	clientMsg.setArrList(lst);
}

}
