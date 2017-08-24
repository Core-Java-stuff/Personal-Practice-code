package com.sjgm.pro.crick;

public enum Discount_Amount {

	PREMIUM(20), GOLD(15), SILVER(10), NO(0);
	int amount = 0;

	Discount_Amount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
