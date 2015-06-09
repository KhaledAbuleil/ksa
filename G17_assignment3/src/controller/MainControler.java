package controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

import Entity.request;
import G17Client.ChatClient;
import user_page_GUI.mainpage;
import Request_GUI.RequestFill;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.Size;
import common.ChatIF;

import javax.swing.JButton;

public abstract class MainControler implements java.awt.event.ActionListener{
	private static final ActionListener MainControler = null;
	private static ChatClient clientConection;
	static String serverAdd = null;
	static   ChatIF clientUI; 
	static int portInt;


	public static void main(String[] args) throws IOException, InterruptedException {
		
	}
	public static ChatClient getInstance() {
		if (clientConection == null)
			try {
				clientConection = new ChatClient(serverAdd,portInt,clientUI);
			} catch (IOException e) {
				System.out.println("MainController -> getInstance");
				e.printStackTrace();
			}
		return clientConection;
	}

}
