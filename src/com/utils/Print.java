package com.utils;

import java.io.PrintStream;

public class Print {
	
	//��ӡ������
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	//����
	public static void print(){
		System.out.println();
	}
	
	//��ӡ��������
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	
	public static PrintStream print(String format, Object... args){
		return System.out.printf(format, args);
	}
}
