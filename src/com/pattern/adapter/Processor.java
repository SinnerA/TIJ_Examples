package com.pattern.adapter;

public interface Processor {
	
	String name();
	
	Object process(Object input);
}
