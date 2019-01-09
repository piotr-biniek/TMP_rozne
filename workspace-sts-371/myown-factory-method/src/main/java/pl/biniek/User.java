package pl.biniek;


public class User {
	
	private String name;
	private int age;
	private User(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	
	public static User getInstance(String name,int age) {
		return new User(age, name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	

}
