package application;

import java.io.Serializable;
import java.lang.String;
public class Users implements Serializable
{
	public String username;
	public String password;
	public String type;

	public Users(String username,String password, String type)
	{
		this.username= username;
		this.password= password;
		this.type=type;
		
		
	}
	
	
	public void AttemptQuiz()
	{
		
	}
	
	
	
	

}
