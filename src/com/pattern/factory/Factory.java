package com.pattern.factory;

/**
 * 定义了创建对象的接口，但有子类决定要实例化的类是哪一个。工厂方法把类实例化推迟到了子类（GOF）
 * 
 * 工厂方法是针对每一种产品提供一个工厂类，通过不同的工厂实例来创建不同的产品实例。
 * @author SinnerA
 * @version 1.0, 07/10/2013
 *
 */
public class Factory {
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args){
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
