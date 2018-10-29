package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean(name = "myBean")
	public MyBean createMyBean() {
		return new MyBean();
	}
}
