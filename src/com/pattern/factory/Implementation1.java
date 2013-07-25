package com.pattern.factory;

import static com.utils.Print.*;

public class Implementation1 implements Service {

	Implementation1(){}
	
	@Override
	public void method1() {
		print("Implementation1 mothod1");
	}

	@Override
	public void method2() {
		print("Implementation1 mothod2");
	}

}
