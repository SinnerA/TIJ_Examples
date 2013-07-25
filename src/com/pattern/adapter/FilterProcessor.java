package com.pattern.adapter;

/**
 * ������ģʽ��һ���ӿ�ת���ɿͻ�ϣ��������һ���ӿڣ���ʹ��ԭ�����ڽӿڲ����ݶ�������һ��������Щ�����һ������
 * <br><br>
 * ʹ�ó�����
 * <p><blockquote><pre>
 * 1. ϣ������һЩ�ִ���࣬���ǽӿ����븴�û���Ҫ��һ�¡�
 * 2. ��ʵ������ģʽ�е�����֮�٣���ǰ����Ƶ�ʱ�����ǾͲ�Ӧ�ÿ���������ģʽ����Ӧ�ÿ���ͨ���ع�ͳһ�ӿڡ�
 * </pre></blockquote>
 * @author SinnerA
 * @version 1.0, 07/09/2013
 *
 */
public class FilterProcessor {
	public static void main(String[] args){
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
