package Entity;

import java.io.Serializable;
import java.util.Date;

public class MyFile implements Serializable {
private String Fname ;
private String FID;
private String PhysicleAdd;
private String vertadd;
private String Describe;
private String Type;
private int Privilege;
private int Removed;
private int IsUpdating;
private Date updateDate;
private int size=0;
private String Owner;
public  byte[] mybytearray;

public  MyFile(){}

public  MyFile( String name , String ID, String Add, String Desc,String type, int Priv,int Remov,int IsUpd,Date updDate,String vertadd){	
		this.FID=ID;
this.Fname=name;
	this.Type=type;	
	this.PhysicleAdd=Add;
	this.Describe=Desc;

	this.Privilege=Priv;
	this.Removed=Remov;
	this.IsUpdating=IsUpd;
	//this.updateDate=updDate;
	this.vertadd=vertadd;
	
}
public void SetOwner(String owner)
{
	this.Owner=owner;
}
public String getOwner()
{
	return(this.Owner);
}
public void initArray(int size)
{
	mybytearray = new byte [size];	
}

public MyFile( String fileName) {
	this.Fname = fileName;
}



public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public byte[] getMybytearray() {
	return mybytearray;
}

public byte getMybytearray(int i) {
	return mybytearray[i];
}

public void setMybytearray(byte[] mybytearray) {
	
	for(int i=0;i<mybytearray.length;i++)
	this.mybytearray[i] = mybytearray[i];
}

public void setType(String type){
	this.Type=type;
}
public void setFname(String name){
	this.Fname=name;
}
public void setFID(String id){
	this.FID=id;
}
public void setPhysicleAdd(String phyadd){
	this.PhysicleAdd=phyadd;
}
public void setvertadd(String vertadd){
	this.vertadd=vertadd;
}
public void setPrivilege(int priv){
	this.Privilege=priv;
}
public void setRemoved(int remov){
	this.Removed=remov;
}
public void setIsUpdating(int isupd){
	this.IsUpdating=isupd;
}
public void setupdateDate(Date date){
	this.updateDate=date;
}
public void setDescribe(String desc){
	this.Describe=desc;
}

public String getFname(){
	return this.Fname;
}
public String getFID(){
	return this.FID;
}
public String getvertadd(){
	return this.vertadd;
}
public String getPhysicleAdd(){
	return this.PhysicleAdd;
}
public int getPrivilege(){
	return this.Privilege;
}
public int getRemoved(){
	return this.Removed;
}
public int getIsUpdating(){
	return this.IsUpdating;
}
public Date getupdateDate(){
	return this.updateDate;
}
public String getDescribe(){
	return this.Describe;
}
public String getType(){
	 return this.Type;
}
}
