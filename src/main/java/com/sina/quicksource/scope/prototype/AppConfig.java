package com.sina.quicksource.scope.prototype;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "demoForPrototype")
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public DemoForPrototype sunnyDay() {
		return new DemoForPrototype();
	}

}