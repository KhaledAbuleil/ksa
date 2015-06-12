
package Entity;

import java.io.Serializable;

public class user implements Serializable{
	protected String username;
	protected String firstname;
	protected String lastname;
	protected String password;
	protected String Role;
	protected String Status;
	
	public  user() 
	{
	}
	public  user(String username,String password) 
	{
		this.username=username;
		this.password=password;
	}
	
public void setUsername(String username ) {
	this.username=username;
}
public String getUsername(){
	return this.username;
}
public void setfirstname(String firstname ) {
	this.firstname=firstname;
}
public String getfirstname(){
	return this.firstname;
}
public void setlastname(String lastname ) {
	this.username=lastname;
}
public String getlastname(){
	return this.lastname;
}
public void setRole(String Role ) {
	this.Role=Role;
}
public String getRole(){
	return this.Role;
}
public void setStatus(String Status ) {
	this.Status=Status;
}
public String getStatus(){
	return this.Status;
}
public void setPassword(String password ) {
	this.password=password;
}
public String getPassword(){
	return this.password;
}

}
