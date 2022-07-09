package com.sina.quicksource.lifecycle.usage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

	@Bean(name = "demoForInintAndDispo")
	public Demo demo() {
		return new Demo();
	}
	
	@Bean(initMethod = "init")
    public Demo init() {
        return new Demo();
    }
	
    @Bean(destroyMethod = "destroy")
    public Demo destroy() {
        return new Demo();
    }
}