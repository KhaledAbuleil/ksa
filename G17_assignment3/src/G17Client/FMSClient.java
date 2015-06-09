// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package G17Client;

import ocsf.client.*;

import java.io.*;
import java.util.ArrayList;

import controller.MainControler;
import controller.Useroption;
import Message.Message;


/**
 * This class overrides some of the methods defined in the abstract
 * superclass in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * @version July 2000
 */
public class FMSClient extends AbstractClient
{
	private ClientConnectTOServer clientUI;
  //Instance variables **********************************************
  
  /**
   * The interface type variable.  It allows the implementation of 
   * the display method in the client.


  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the chat client.
   *
   * @param host The server to connect to.
   * @param port The port number to connect on.
   * @param clientUI The interface type variable.
   */
  
	public FMSClient(String host, int port) throws IOException {
		super(host, port); // Call the superclass constructor
		openConnection();
		this.clientUI = new ClientConnectTOServer();
	}
  public FMSClient(String host, int port, ClientConnectTOServer clientUI) 
    throws IOException 
  {
    super(host, port); //Call the superclass constructor
    this.clientUI = clientUI;
    openConnection();
    clientUI.textPane.append("Connection Succeded");
  }

  
  //Instance methods ************************************************
    
  /**
   * This method handles all data that comes in from the server.
   *
   * @param msg The message from the server.
   */
  public void handleMessageFromServer(Object msg) 
  {
	  Message ServerMsg = (Message)msg;
	 switch( ServerMsg.getMsg())
	 {
	 case "UserLogIn":
	 {
		 MainControler.userRole(ServerMsg);
		 break;
	 }
	 case "Get the files name":
	 {
		 CheckInput.checkInput.names=new ArrayList<String>((ServerMsg.getArrList()));
		 break;
	 }
	 case "2":
	 {
		 Useroption.showInPanl(ServerMsg);
		 break;
	 }
     case "Files System":
     {
    	 Useroption.setfilessystem(ServerMsg);
     }}
	  
  }

  /**
   * This method handles all data coming from the UI            
   *
   * @param message The message from the UI.    
   */
  public void handleMessageFromClientUI(String message)
  {
    try
    {
    	sendToServer(message);
    }
    catch(IOException e)
    {
      //clientUI.display
        //("Could not send message to server.  Terminating client.");
      quit();
    }
  }
  
  /**
   * This method terminates the client.
   */
  public void quit()
  {
    try
    {
      closeConnection();
    }
    catch(IOException e) {}
    System.exit(0);
  }
}
//End of ChatClient class
