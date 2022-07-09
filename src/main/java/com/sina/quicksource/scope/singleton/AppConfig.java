package com.sina.quicksource.scope.singleton;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "demoForPrototype")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public DemoForSingleton sunnyDay() {
		return new DemoForSingleton();
	}

}