package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UserPageGUI.CreateNewFileGUI;
import UserPageGUI.UploadFile;

//for Create a new file
public  class fileControler implements java.awt.event.ActionListener {
private fileControler CreateFtile;
private UploadFile upfile;

public fileControler()
{
	CreateFtile=new fileControler();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	switch(e.getActionCommand())
	{
	case  "UploadFile":
	{
		upfile=new UploadFile();
		System.out.println("aaaa");
		break;
	}
		
	
	
	}
}



//.addActionListener(new ActionListener() {
 //	public void actionPerformed(ActionEvent e) {
}
