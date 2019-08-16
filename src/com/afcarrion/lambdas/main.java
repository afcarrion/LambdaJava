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
		
		OnOneListener onOne3 = message -> System.out.println("Tu mensaje");
		
		onOne.onOne("Sin LAMBDA");
		onOne2.onOne("Con Lambda :)");
		
	}

}
