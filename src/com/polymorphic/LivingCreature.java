package com.polymorphic;

import static com.utils.Print.*;

class LivingCreature {
	
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		print("LivingCreature");
	}
	
	protected void dispose(){
		print("LivingCreature dispose");
		p.dispose();
		t.dispose();
	}
}
