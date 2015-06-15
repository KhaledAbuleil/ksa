package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.IOException;
import java.sql.Date;

import javax.swing.JOptionPane;

import UserPageGUI.RequestFill;
import UserPageGUI.UserMainPageGUI;
import controller.MainControler;
import Entity.request;
public class Useroption implements java.awt.event.ActionListener{
	private static final ActionListener Useroption = null;
	private UserMainPageGUI UserPage;
	private Object request;
	private static UserPageGUI.RequestFill RequestFill ;
	
	public Useroption(){
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		/**
		 * switch to the relevant case to send to the server.
		 */
		
		switch (e.getActionCommand()) 
		{
		case ("Create File"):

			break;
		}
		
	}
	public void addGuiPage( UserMainPageGUI adminPage)
	{
		this.UserPage=adminPage;
	}
}