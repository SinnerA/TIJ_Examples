package com.polymorphic;

import static com.utils.Print.*;

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}
	
	protected void dispose(){
		print("disposing Description " + s);
	}
}
