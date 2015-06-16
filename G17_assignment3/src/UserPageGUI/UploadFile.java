package UserPageGUI;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UploadFile extends JFrame{
	private File selectedFile;
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
		    File selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    selectedFile
		}
	}
	public String SelectedPath()
	{
		if(selectedFile!=null)
	return selectedFile.getAbsolutePath();
		
		else
			return null;
	}
}