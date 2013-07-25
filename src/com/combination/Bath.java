package com.combination;

public class Bath {
	
	private String s1 = "Happy";
	private String s2 = "Happy";
	private String s3;
	private String s4;
	
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.print("Inside Bath()");
		s3 = "joy";
		toy = 3.14F;
		castille = new Soap();
	}
	
	{
		i = 47;
	}
	
	public String toString(){
		//∂Ë–‘≥ı ºªØ
		if(s4 == null){
			s4 = "Joy";
		}
		
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + 
		         "i = " + i + "\n" + "toy = " + toy + "\n" + "castille = " + castille;
	}

	public static void main(String[] args){
		Bath bath = new Bath();
		System.out.print(bath);
	}
}
