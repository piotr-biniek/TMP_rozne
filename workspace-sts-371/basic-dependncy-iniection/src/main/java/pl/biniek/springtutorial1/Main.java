package pl.biniek.springtutorial1;

import pl.biniek.springtutorial1.api.Logger;
import pl.biniek.springtutorial1.api.UserRepository;
import pl.biniek.springtutorial1.domain.User;
import pl.biniek.springtutorial1.impl.*;

public class Main {

	public static void main(String[] args) {
		
		Logger  loger= new LoggerImpl();	
		UserRepository userRepo = new UserRepositoryImpl();
		userRepo.setLogger(loger);
		User user1 = userRepo.createUser("janek");


	}

}
