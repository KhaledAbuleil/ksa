package Entity;

public class group {
	private String gid;
	private String gname;
	public group(String id , String name){
		this.gid=id;
		this.gname=name;
	}
	protected void setgid(String id){
		this.gid=id;
	}
	protected void setgname(String name){
		this.gname=name;
	}
	 protected String getid(){
		 return this.gid;
	 }
	 protected String getname(){
		 return this.gname;
	 }

}
