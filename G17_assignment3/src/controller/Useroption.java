package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.IOException;
import java.sql.Date;

import javax.swing.JOptionPane;

import controller.MainControler;
import Entity.request;
import G17Client.ChatClient;
import user_page_GUI.mainpage;
import Request_GUI.RequestFill;
public class Useroption implements java.awt.event.ActionListener{
	private static final ActionListener Useroption = null;
	private mainpage mpgui;
	private Object request;
	private static Request_GUI.RequestFill RequestFill ;
	private static ChatClient clientConection;
	
	public Useroption(){
		if(clientConection == null)
		clientConection = MainControler.getInstance();
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
				intRqGroup=Integer.parseInt(RqGroup);
				RqGroup = mpgui.RequestFill.textgroup.getText();
				RqType=(String) mpgui.RequestFill.type.getSelectedItem();
				RqDays=Integer.parseInt((String) mpgui.RequestFill.days.getSelectedItem());
				RqMonths=Integer.parseInt((String) mpgui.RequestFill.months.getSelectedItem());
				RqYears=Integer.parseInt((String) mpgui.RequestFill.years.getSelectedItem());
				Date Rqdate = new Date(RqYears,RqMonths,RqDays);				
				if(RqType.equals("Join"))
                request request = new request(intRqGroup,Rqdate,1,Rquname);

				}
		
}}
