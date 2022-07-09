package com.sina.quicksource.lifecycle.usage;

import org.springframework.beans.factory.DisposableBean;

public class Demo implements DisposableBean {

	private String message;

	public void getMessage() {
		System.out.print(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	private void init() {
		System.out.print("This is an initialisation logic.\n");
	}

	@Override
	public void destroy() throws Exception {
		System.out.print("This is a decustruction logic.\n");
	}

}
