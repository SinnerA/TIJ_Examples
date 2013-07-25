package com.pattern.strategy;

class Processor {
	String name(){
		return getClass().getSimpleName();
	}
	
	Object process(Object input){
		return input;
	}
}
