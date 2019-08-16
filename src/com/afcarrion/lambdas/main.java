package com.afcarrion.lambdas;

public class main {

	public static void main(String[] args) {
		
		OnOneListener onOne = new OnOneListener() {
			@Override
			public void onOne(String message) {
				System.out.println("One: "+ message);	
			}
		};
		
		OnOneListener onOne2 = (String message) -> {
			System.out.println("One Lambda :) " + message);
		};
		
		onOne.onOne("Sin LAMBDA");
		onOne2.onOne("Con Lambda :)");
		
	}

}
