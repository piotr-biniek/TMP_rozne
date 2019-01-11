package pl.biniek;

public class User {
private String name;
private Addres adres;


public User() {
	
}

public User(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Addres getAdddres() {
	return adres;
}
public void setAdddres(Addres addres) {
	this.adres = addres;
}

@Override
public String toString() {
	return "User [name=" + name + ", adres=" + adres + "]";
}



}
