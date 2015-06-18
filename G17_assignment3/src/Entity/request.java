package Entity;

import java.util.Date;

public class request {
private String Rname;
private int Rnum ;
//private Date date;
private String Rtype;
private String username;
public request(){}
public request (int num,String type,String name){
	this.Rnum=num;
	this.Rtype=type;
//	this.date=date;
	this.username=name;
}

public void setRname(String name){
	this.Rname=name;
} 

public void setRnum(int num){
	this.Rnum=num;
}
public void setRtype(String type){
	this.Rtype=type;
}

//protected void setDate(Date date){
	//this.date=date;
//}

public void setusername(String name){
	this.username=name;
}

public int getRnum(){
	return this.Rnum;
}
public String getRtype(){
	return this.Rtype;
}
//protected Date getDate(){
	//return this.date;
//}
public String getusername(){
	return this.username;}

public String getname(){
	return this.Rname;
}
}

