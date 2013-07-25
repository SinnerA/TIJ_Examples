package com.utils;

import java.io.PrintStream;

public class Print {
	
	//打印，换行
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	//换行
	public static void print(){
		System.out.println();
	}
	
	//打印，不换行
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	
	public static PrintStream print(String format, Object... args){
		return System.out.printf(format, args);
	}
}
