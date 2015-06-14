package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.IOException;
import java.sql.Date;

import javax.swing.JOptionPane;

import controller.MainControler;
import Entity.request;
import user_page_GUI.RequestFill;
import user_page_GUI.mainpage;
public class Useroption implements java.awt.event.ActionListener{
	private static final ActionListener Useroption = null;
	private mainpage adminPage;
	private Object request;
	private static user_page_GUI.RequestFill RequestFill ;
	
	public Useroption(){
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		/**
		 * switch to the relevant case to send to the server.
		 */
		
		switch (e.getActionCommand()) {

		
//===========================Send Request============================
			case "Send Request":
				String RqType;
				String RqGroup;
				int RqDays;
				int RqYears;
				int RqMonths;
				String Rquname;
				int intRqGroup;
			//	intRqGroup=Integer.parseInt(RqGroup);
				//RqGroup = mpgui.RequestFill.textgroup.getText();
				//RqType=(String) mpgui.RequestFill.type.getSelectedItem();
				//RqDays=Integer.parseInt((String) mpgui.RequestFill.days.getSelectedItem());
			//	RqMonths=Integer.parseInt((String) mpgui.RequestFill.months.getSelectedItem());
				//RqYears=Integer.parseInt((String) mpgui.RequestFill.years.getSelectedItem());
				//Date Rqdate = new Date(RqYears,RqMonths,RqDays);				
				//if(RqType.equals("Join"));

		}
	}
	public void addGuiPage( mainpage adminPage)
	{
		this.adminPage=adminPage;
	}
}
