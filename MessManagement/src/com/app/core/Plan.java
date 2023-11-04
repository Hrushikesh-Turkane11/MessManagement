package com.app.core;

public enum Plan {
	MONTHLY (3000), QUARTERLY (11700), HALFYEAR (17500), YEARLY (32000);
	
	private final double price;
	private Plan(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
}
