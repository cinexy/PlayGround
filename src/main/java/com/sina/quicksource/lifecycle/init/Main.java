package com.sina.quicksource.lifecycle.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}
    
    public void init() {
    	//Some initialisation logic
    }
}
