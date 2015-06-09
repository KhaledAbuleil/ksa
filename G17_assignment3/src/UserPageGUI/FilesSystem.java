package UserPageGUI;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import controller.MyTreeModelListener;
import Entity.MyFile;
import Entity.folder;
import javax.swing.JButton;
import SQLServices.fileSQLServices;

public class FilesSystem extends JPanel{
	JTree tree ;
	DefaultMutableTreeNode rootNode;
	DefaultTreeModel treeModel;
	public FilesSystem() {	
		setLayout(null);
	setSize(646,332);
	 rootNode = new DefaultMutableTreeNode("Root Node");
	 treeModel = new DefaultTreeModel(rootNode);
	treeModel.addTreeModelListener(new MyTreeModelListener());

	tree = new JTree(treeModel);
	tree.setBounds(10, 11, 626, 241);
	tree.setEditable(true);
	tree.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
	tree.setShowsRootHandles(true);
	add(tree);
	}
	
public JTree defaultree(){
	JTree tree = new JTree();
	tree.setBounds(0, 0, 208, 332);
	return tree;
}
public DefaultTreeModel temp1(){
	DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root Node");
	DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
	treeModel.addTreeModelListener(new MyTreeModelListener());
	return treeModel;
	
}
public DefaultMutableTreeNode addfile(DefaultMutableTreeNode folder,MyFile file){
	DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(file.getFname());
	folder.add(rootNode);
	return folder;
}

}
