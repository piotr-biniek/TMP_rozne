package pl.biniek;

public class Addres {
private String town;
private String street;

public Addres(String town, String street) {
	super();
	this.town = town;
	this.street = street;
}

@Override
public String toString() {
	return "Addres [town=" + town + ", street=" + street + "]";
}



}
