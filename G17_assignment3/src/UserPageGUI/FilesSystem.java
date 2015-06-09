package UserPageGUI;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class FilesSystem extends JPanel{
	private JTree tree;
	private DefaultMutableTreeNode root;
	public FilesSystem(){
		setLayout(null);
		setSize(646,332);
		
		 tree = new JTree();
		 tree.setEditable(true);
		 tree.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 tree.setForeground(new Color(0, 0, 0));
		 tree.setToolTipText("");
		  root= new DefaultMutableTreeNode("Workspace")  ;
		 tree.setModel(new DefaultTreeModel(root));
		tree.setBounds(0, 0, 646, 332);
		
		add(tree);
		
		ImageIcon imageIcon = new ImageIcon(File.class.getResource("File.png"));
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		renderer.setLeafIcon(imageIcon);

	        this.setVisible(true);
		

	}
}
