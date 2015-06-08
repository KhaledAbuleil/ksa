package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.IOException;

import javax.swing.JOptionPane;

import controller.MainControler;
import Entity.request;
import user_page_GUI.mainpage;
import Request_GUI.RequestFill;
public class Useroption implements java.awt.event.ActionListener{
	private mainpage mpgui;
	private static Request_GUI.RequestFill RequestFill ;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		/**
		 * switch to the relevant case to send to the server.
		 */
		
		switch (e.getActionCommand()) {

		
//===========================Set Order ============================
			case "Send Request":
				String RqType;
				String RqGroup;
				String RqDate;
				
				
				sOEmpId = SEGui.setOrderPnl.textFieldEmpId.getText();
				sOrderId = SEGui.setOrderPnl.textFieldOrderId.getText();
				sOCusId =SEGui.setOrderPnl.textFieldCustomerId.getText();
				sODate = SEGui.setOrderPnl.textFieldDate.getText();
				sPrice = SEGui.setOrderPnl.textFieldPrice.getText();
				RqType = MainControler.getSalesGui().setOrderPnl.comboBoxSetOrder.getSelectedItem().toString();
				}
}}
