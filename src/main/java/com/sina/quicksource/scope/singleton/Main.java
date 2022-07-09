package com.sina.quicksource.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	DemoForSingleton mess1 = (DemoForSingleton) context.getBean("demoForPrototype");
	mess1.setMessage("If shown once only, I'm an example of a ´Singleton´ scope; otherwise a ´Prototype´.");
	mess1.getMessage();
	
	DemoForSingleton mess2 = (DemoForSingleton) context.getBean("demoForPrototype");
	mess2.getMessage();

	System.out.print(mess1 + "\n");
	System.out.print(mess2 + "\n");
	}

}
