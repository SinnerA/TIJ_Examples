package com.enumTest;

public class CurrencyDescribe {

	Currency c;
	public CurrencyDescribe(Currency c) {
		this.c = c;
	}
	
	public void describe(){
		System.out.print("This currency is ");
		switch(c){
		case CNY:
			System.out.println("�����");
			break;
		case HDK:
			System.out.println("�۱�");
			break;
		case USD:
		case EUR:
		case GBP:
		case JPY:
		default:
				System.out.println("��������");
		}
	}
	
	public static void main(String[] args){
		CurrencyDescribe rmb = new CurrencyDescribe(Currency.CNY);
		CurrencyDescribe hdk = new CurrencyDescribe(Currency.HDK);
		CurrencyDescribe other = new CurrencyDescribe(Currency.USD);
		
		rmb.describe();
		hdk.describe();
		other.describe();
	}
}
