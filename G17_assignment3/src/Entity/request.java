package Entity;

import java.util.Date;

public class request {
private int Rnum ;
//private Date date;
private Boolean Rtype;
private String username;
public request(){}
public request (int num,Boolean type,String name){
	this.Rnum=num;
	this.Rtype=type;
//	this.date=date;
	this.username=name;
}

protected void setRnum(int num){
	this.Rnum=num;
}
protected void setRtype(Boolean type){
	this.Rtype=type;
}

//protected void setDate(Date date){
	//this.date=date;
//}

protected void setusername(String name){
	this.username=name;
}

protected int getRnum(){
	return this.Rnum;
}
protected Boolean getRtype(){
	return this.Rtype;
}
//protected Date getDate(){
	//return this.date;
}
protected String getusername(){
	return this.username;}

}
