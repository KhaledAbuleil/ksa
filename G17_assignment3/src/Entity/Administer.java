package Entity;

public class Administer {
	private String id;
	private String name;
	public  Administer(String id, String name) {
		this.id=id;
		this.name=name;
	}
protected void setid(String id ) {
	this.id=id;
}
protected void setname(String name ) {
	this.name=name;
}

protected String getid(){
	return this.id;
}
protected String getname(){
	return this.name;
}

}
