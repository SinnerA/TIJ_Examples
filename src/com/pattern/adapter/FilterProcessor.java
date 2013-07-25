package com.pattern.adapter;

/**
 * 适配器模式将一个接口转换成客户希望的另外一个接口，它使得原来由于接口不兼容而不能在一起工作的那些类可以一起工作。
 * <br><br>
 * 使用场景：
 * <p><blockquote><pre>
 * 1. 希望复用一些现存的类，但是接口又与复用环境要求不一致。
 * 2. 其实适配器模式有点无奈之举，在前期设计的时候，我们就不应该考虑适配器模式，而应该考虑通过重构统一接口。
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
