package pl.biniek.springtutorial1.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import pl.biniek.springtutorial1.api.Logger;

@Service
public class LoggerImpl implements Logger{

	public void Log(String message) {
		System.out.println(new Date()+" : "+message);
		
	}

}
