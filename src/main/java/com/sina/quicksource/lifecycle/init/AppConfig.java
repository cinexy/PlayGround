package com.sina.quicksource.lifecycle.init;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "demoForPrototype")
	public DemoForInit demo() {
		return new DemoForInit();
	}

}