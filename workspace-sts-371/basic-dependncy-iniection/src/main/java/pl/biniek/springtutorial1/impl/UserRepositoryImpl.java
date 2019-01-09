package pl.biniek.springtutorial1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pl.biniek.springtutorial1.api.Logger;
import pl.biniek.springtutorial1.api.UserRepository;
import pl.biniek.springtutorial1.domain.User;

@Service
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private Logger logger;

	public User createUser(String name) {
		logger.Log("Tworzenie usera : "+name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger=logger;
		// TODO Auto-generated method stub
		
	}

}
