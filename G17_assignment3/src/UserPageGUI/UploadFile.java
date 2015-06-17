package UserPageGUI;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.activation.MimetypesFileTypeMap;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Entity.MyFile;

public class UploadFile extends JFrame{
	public File selectedFile=null;
	private JPanel contentPane ;
	public UploadFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 544);
	 contentPane = new JPanel();
	 
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setBounds(0, 34, 434, 228);
		add(fileChooser);
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
		     selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath()+selectedFile.getName()+"  "+ getFileType());
		   
		}
	}
	public String SelectedPath()
	{
		if(selectedFile!=null)
	return selectedFile.getAbsolutePath();
		
		else
			return null;
	}
	public String getFileName()
	{
		if(selectedFile!=null)
	return selectedFile.getName();
		
		else
			return null;
	}
	public String getFileType()
	{
		if(selectedFile!=null)
		{
		String Str= selectedFile.getAbsolutePath();
		String extension = "";

		int i = Str.lastIndexOf('.');
		if (i >= 0)
		    return(extension = Str.substring(i+1));
		}
			return "null";
	}
}