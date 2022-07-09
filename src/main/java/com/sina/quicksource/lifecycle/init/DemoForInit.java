package com.sina.quicksource.lifecycle.init;

import org.springframework.beans.factory.InitializingBean;

public class DemoForInit implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		//Some initialisation logic
	}

}
