package com.pattern.factory;

public class Implementation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		return new Implementation2();
	}
}
