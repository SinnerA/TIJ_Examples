package com.pattern.strategy;

import static com.utils.Print.*;

/**
 * ��������һϵ�е��㷨������ÿһ���㷨��װ����������ʹ���ǻ������໥�滻������ģʽ���㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ���
 * <br><br>
 * ������ͬ���õ��Ľ����һ����
 * <br><br>
 * ʹ�ó�����
 * <p><blockquote><pre>
 * 1. һ�����飬�кܶ෽������ʵ�֡�
 * 2. �ҿ������κ�ʱ�򣬾���������һ��ʵ�֡�
 * 3. δ���������Ӹ���ķ�����
 * 4. ����ģʽ�÷����ı仯����Ӱ�쵽ʹ�÷����Ŀͻ���
 * </pre></blockquote>
 * @author SinnerA
 * @version 1.0, 07/08/2013
 *
 */
public class Apply {
	public static void process(Processor p, Object s){
		print("Using Processor " + p.name());
		print(p.process(s));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args){
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
