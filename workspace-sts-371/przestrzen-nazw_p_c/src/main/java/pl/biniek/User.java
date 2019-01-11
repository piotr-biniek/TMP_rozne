package pl.biniek;

import java.util.Locale;

public class User {
	
	private String name;
	private int age;
	Locale locale;
	public  User(String name,int age,Locale loc ) {
		locale=loc;
		this.age=age;
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
