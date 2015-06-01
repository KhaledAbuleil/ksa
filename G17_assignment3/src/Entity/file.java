package Entity;

import java.util.Date;

public class file {
private String Fname ;
private String FID;
private String PhysicleAdd;
private String Describe;
private String Type;
private int Privilege;
private int Removed;
private int IsUpdating;
private Date updateDate;
public  file(){}
public  file( String name , String ID, String Add, String Desc,String type, int Priv,int Remov,int IsUpd,Date updDate){	
	this.Fname=name;
	this.FID=ID;
	this.PhysicleAdd=Add;
	this.Describe=Desc;
	this.Type=type;
	this.Privilege=Priv;
	this.Removed=Remov;
	this.IsUpdating=IsUpd;
	this.updateDate=updDate;
	
}
protected void setType(String type){
	this.Type=type;
}
protected void setFname(String name){
	this.Fname=name;
}
protected void setFID(String id){
	this.FID=id;
}
protected void setPhysicleAdd(String phyadd){
	this.PhysicleAdd=phyadd;
}
protected void setPrivilege(int priv){
	this.Privilege=priv;
}
protected void setRemoved(int remov){
	this.Removed=remov;
}
protected void setIsUpdating(int isupd){
	this.IsUpdating=isupd;
}
protected void setupdateDate(Date date){
	this.updateDate=date;
}
protected void setDescribe(String desc){
	this.Describe=desc;
}

protected String getFname(){
	return this.Fname;
}
protected String getFID(){
	return this.FID;
}
protected String getPhysicleAdd(){
	return this.PhysicleAdd;
}
protected int getPrivilege(){
	return this.Privilege;
}
protected int getRemoved(){
	return this.Removed;
}
protected int getIsUpdating(){
	return this.IsUpdating;
}
protected Date getupdateDate(){
	return this.updateDate;
}
protected String getDescribe(){
	return this.Describe;
}
protected String getType(String type){
	 return this.Type;
}
}
