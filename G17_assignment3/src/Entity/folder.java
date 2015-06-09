package Entity;

public class folder {
private String foid ;
private String foname;
private String backfoid;
private String address;
public folder(String foid, String foname ,String bfoid ,String add){
	this.foid=foid;
	this.foname=foname;
	this.backfoid=bfoid;
	this.address=add;
}
protected void setfoid(String id){
	this.foid=id;
}
protected void setfoname(String name){
	this.foname=name;
}
protected void setbackfoid(String id){
	this.backfoid=id;
}
protected void setaddress(String add){
	this.address=add;
}
protected String getfoid(){
	return this.foid;
}
protected String getfoname(){
	return this.foname;
}
protected String getbackfoid(){
	return this.backfoid;
			}
protected String geaddress(){
	return this.address;
}

}
