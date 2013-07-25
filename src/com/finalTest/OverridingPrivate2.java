package com.finalTest;

import static com.utils.Print.print;

public class OverridingPrivate2 extends OverridingPrivate{

	public final void f(){
		print("OverridingPrivate2.f()");
	}
	
	public void g(){
		print("OverridingPrivate2.g()");
	}
}
