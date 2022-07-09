package com.sina.quicksource.lifecycle.destroy;

import org.springframework.beans.factory.DisposableBean;

public class DemoForDispo implements DisposableBean {

	@Override
	public void destroy() throws Exception {
		//Some destruction logic
	}

}
