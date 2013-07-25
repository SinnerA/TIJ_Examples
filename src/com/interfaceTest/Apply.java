package com.interfaceTest;

import static com.utils.Print.*;

public class Apply {
	
	public static void process(Processor p, Object s){
		print("Using Processor " + p.name());
        print(p.process(s));
	}
}
