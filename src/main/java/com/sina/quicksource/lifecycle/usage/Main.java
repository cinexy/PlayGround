package com.sina.quicksource.lifecycle.usage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Demo demo = (Demo) context.getBean("demoForInintAndDispo");
		demo.setMessage("This is the main message.\n");
		demo.getMessage();

	}
}
	