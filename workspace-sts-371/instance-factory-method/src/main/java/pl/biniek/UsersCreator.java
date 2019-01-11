package pl.biniek;

import java.util.logging.Logger;

public class UsersCreator {
	
	Logger loger = Logger.getLogger(this.getClass().getName());
	public User createUser(String name) {
		User user = new User();
		user.setName(name);
		loger.info("Utworzono usera "+name);
		return user;
		
		
	}

}
