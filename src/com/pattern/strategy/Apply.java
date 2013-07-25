package com.pattern.strategy;

import static com.utils.Print.*;

/**
 * 它定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法的变化不会影响到使用算法的客户。
 * <br><br>
 * 参数不同，得到的结果不一样。
 * <br><br>
 * 使用场景：
 * <p><blockquote><pre>
 * 1. 一件事情，有很多方案可以实现。
 * 2. 我可以在任何时候，决定采用哪一种实现。
 * 3. 未来可能增加更多的方案。
 * 4. 策略模式让方案的变化不会影响到使用方案的客户。
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
