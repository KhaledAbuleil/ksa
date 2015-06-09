package UserPageGUI;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import SQLServices.fileSQLServices;
import controller.MyTreeModelListener;
import Entity.MyFile;
import Entity.folder;
import Entity.userfiles;

import javax.swing.JButton;


public class FilesSystem extends JPanel{
	JTree tree ;
public	ArrayList<String> filesnodes = new ArrayList<String>();
public userfiles[] usefil;
	DefaultMutableTreeNode rootNode;
	DefaultTreeModel treeModel;
	public FilesSystem() {	
		setLayout(null);
	setSize(646,332);
     add(this.defaultree());
     
     JButton btnFilesSystem = new JButton("Files System");
     btnFilesSystem.setBounds(269, 110, 108, 23);
     add(btnFilesSystem);
	}
	public FilesSystem(userfiles[] uf) {
		this.usefil=uf;
		setLayout(null);
		setSize(646,332);
		tree.setBounds(0, 0, 208, 332);
		tree=new JTree(this.sysbuild("client"));
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
public DefaultMutableTreeNode addfile(DefaultMutableTreeNode folder,String name){
	DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(name);
	folder.add(rootNode);
	return folder;
}
public void setuserfiles(userfiles[] us){
this.usefil=us;
}
public DefaultMutableTreeNode sysbuild(String username){
	int i,j,beginIndex=0,endIndex=0;
	String Folder;
    JTree tree=null;
    DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("Workspace");
    DefaultMutableTreeNode rootNode = null;
    DefaultMutableTreeNode lastchildNode = null;
	for( i=0;i<2;i++)
	{
		if(this.usefil[i].Owner.equals(username)){
	         int len=this.usefil[i].vertadd.length();
	         endIndex=len;
	         for(j=len;j>0;j--)
	         {
		         beginIndex=(int)(this.usefil[i].vertadd.indexOf('/',j));
	             if(beginIndex!=-1)
	               {
	    	          lastchildNode = new DefaultMutableTreeNode(this.usefil[i].vertadd.substring(beginIndex+1,endIndex));
                       if(endIndex==len){
	             	   rootNode=lastchildNode;        
                        }
                       if(endIndex!=len){
             	        lastchildNode.add(rootNode);
             	        rootNode=lastchildNode;
                        }
                   endIndex=beginIndex;
	              }
	    
	         }
	  treeNode.add(lastchildNode);
	     }
     }
	
	return treeNode;
	}
}



