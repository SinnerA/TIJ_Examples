package com.polymorphic;

import static com.utils.Print.*;

class Characteristic {
	
	private String s;
	Characteristic(String s) {
		this.s = s;
		print("Creating Characteristic " + s);
	}
	
	protected void dispose(){
		print("disposing Characteristic " + s);
	}
}
