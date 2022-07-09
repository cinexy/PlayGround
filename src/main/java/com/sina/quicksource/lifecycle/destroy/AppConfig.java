package com.sina.quicksource.lifecycle.destroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "demoForPrototype")
	public DemoForDispo demo() {
		return new DemoForDispo();
	}

}