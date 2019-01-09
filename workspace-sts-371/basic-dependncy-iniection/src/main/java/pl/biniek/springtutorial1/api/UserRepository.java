package pl.biniek.springtutorial1.api;

import org.springframework.stereotype.Component;

import pl.biniek.springtutorial1.domain.User;
@Component
public interface UserRepository {
	User createUser(String name);
	void setLogger(Logger logger);
	
}
