package e_CommerceShoppingCart;

public class CouponManager {

	public boolean isValid(String couponCode) {
		return couponCode.equals("SALE10") || couponCode.equals("SALE20");
	}

	public double getDiscount(String couponCode) {
		if (couponCode.equals("SALE10"))
			return 10;
		if (couponCode.equals("SALE20"))
			return 20;
		return 0;
	}
}
