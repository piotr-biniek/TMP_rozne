package pl.biniek.springtutorial1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;



@Configuration
@ComponentScan(basePackages={"pl.biniek.springtutorial1.impl"})//autoskan 

public class AppConfig {
	//blah
	
	
}



