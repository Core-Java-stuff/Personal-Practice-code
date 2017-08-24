package com.sjgm.pro.crick;

public class DiscountSystemImpl implements DiscountSystem {

	@Override
	public String purchase(double purchasedAmount, String userType) {
		double discountAmount = calculateDiscount(purchasedAmount, userType);
		return "Hi " + userType + " Card Holder you have to pay "
				+ discountAmount;
	}

	private double calculateDiscount(double purchasedAmount, String userType) {
		double discountAmount = 0;
		switch (userType) {
		case "Premium":
			discountAmount = purchasedAmount - purchasedAmount
					* Discount_Amount.PREMIUM.getAmount() / 100;
			break;
		case "Gold":
			discountAmount = purchasedAmount - purchasedAmount
					* Discount_Amount.GOLD.getAmount() / 100;
			break;
		case "Silver":
			discountAmount = purchasedAmount - purchasedAmount
					* Discount_Amount.SILVER.getAmount() / 100;
			break;
		default:
			discountAmount = purchasedAmount;
			break;
		}
		return discountAmount;
	}

	public static void main(String[] args) {
		DiscountSystem system = new DiscountSystemImpl();
		System.out.println(system.purchase(100, "Premium"));
	}
}
