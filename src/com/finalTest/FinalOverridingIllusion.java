package com.finalTest;

public class FinalOverridingIllusion {
	public static void main(String[] args){
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		//向上转换
		OverridingPrivate op = op2;
		//op.f();
		//op.g();
		
		//向上转换
		WithFinals wf = op2;
		//wf.f();
		//wf.g();
	}
}
