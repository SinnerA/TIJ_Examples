package com.pattern.factory;

/**
 * �����˴�������Ľӿڣ������������Ҫʵ������������һ����������������ʵ�����Ƴٵ������ࣨGOF��
 * 
 * �������������ÿһ�ֲ�Ʒ�ṩһ�������࣬ͨ����ͬ�Ĺ���ʵ����������ͬ�Ĳ�Ʒʵ����
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
