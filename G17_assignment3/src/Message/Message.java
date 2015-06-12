package Message;


import java.io.Serializable;
import java.util.ArrayList;
/**
 * This class used for handling the message object
 */
public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 *  string for the operation string name
	 */
	private String msg;
	/**
	 *  contains the details that employee inserted and the controller have to send to server
	 */
	private Object obj;
	private boolean status;
	private String statusMsg;
	private String strReturn;
	private String strToSend;
	private ArrayList<String> arrList;
	
	/**
	 * default panel
	 */
	public Message()
	{
		this.setMsg(null);
		this.setObj(null);
		this.setStatus(false);
		this.setStatusMsg(null);
		this.setStrReturn(null);
		this.setStrToSend(null);
		this.setArrList(null);
	}
	/**
	 * Initialize Message parameters 
	 * @param o contains the details that employee inserted and the controller have to send to server
	 * @param msg the "name" of operation
	 */
	public Message(Object o,String msg)
	{
		this.setMsg(msg);
		this.setObj(o);
		this.setStatus(false);
		this.setStatusMsg(null);
		this.setStrReturn(null);
		this.setStrToSend(null);
		this.setArrList(null);
	}
	
	public ArrayList<String> getArrList() {
		return arrList;
	}
/**
 * setter for arraylist
 * @param arrList 
 */
	public void setArrList(ArrayList<String> arrList) {
		this.arrList = arrList;
	}

	public String getStrToSend() {
		return strToSend;
	}

	public void setStrToSend(String strToSend) {
		this.strToSend = strToSend;
	}

	public String getStrReturn() {
		return strReturn;
	}

	public void setStrReturn(String strReturn) {
		this.strReturn = strReturn;
	}

	
	
	public Message(String Message)
	{
		this.setMsg(Message);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
/**
 * gets object
 * @return object
 */
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	

}
