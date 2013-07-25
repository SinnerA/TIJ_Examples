package com.enumTest;

public class CurrencyOrder {

	public static void main(String[] args){
		for(Currency c : Currency.values()){
			System.out.println(c + "£¬ordinal " + c.ordinal());
		}
	}
}
