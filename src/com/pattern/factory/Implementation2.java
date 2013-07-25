package com.pattern.factory;

import static com.utils.Print.*;

public class Implementation2 implements Service {

	Implementation2(){}
	
	@Override
	public void method1() {
		print("Implementation2 mothod1");
	}

	@Override
	public void method2() {
		print("Implementation2 mothod2");
	}
	
}
