package com.enumTest;

public class EnumOrder {

	public static void main(String[] args){
		for(Spiciness s : Spiciness.values()){
			System.out.println(s + ", oridinal " + s.ordinal());
		}
	}
}
