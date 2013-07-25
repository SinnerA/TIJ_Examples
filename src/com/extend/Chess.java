package com.extend;

import static com.utils.Print.*;

public class Chess extends BoardGame{

	Chess(){
		super(11);
		print("Chess constructor");
	}
	
	public static void main(String[] args){
		Chess x = new Chess();
	}
}
