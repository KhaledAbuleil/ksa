package UserPageGUI;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class UploadFile extends JPanel{
	private File selectedFile;
	public UploadFile() {
		setLayout(null);
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setBounds(0, 34, 434, 228);
		add(fileChooser);
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
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