package com.finalTest;

import static com.utils.Print.*;

public class OverridingPrivate extends WithFinals {

	private final void f(){
		print("OverridingPrivate.f()");
	}
	
	private void g(){
		print("OverridingPrivate.g()");
	}
}
