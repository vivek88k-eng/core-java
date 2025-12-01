package e_CommerceShoppingCart;

import java.util.Scanner;

public class ShopMain {

	private static Scanner sc = new Scanner(System.in);
	private static ProductManager productManager = new ProductManager();
	private static Cart cart = new Cart();
	private static CouponManager couponManager = new CouponManager();

	public static void main(String[] args) {

		// Pre-loaded products
		productManager.addProduct(new Clothing("C1", "T-Shirt", 500, 20));
		productManager.addProduct(new Electronics("E1", "Mobile", 15000, 10));
		productManager.addProduct(new Grocery("G1", "Rice", 60, 50));

		while (true) {
			System.out.println("\n==== SHOP MENU ====");
			System.out.println("1. Add Product to Cart");
			System.out.println("2. Remove Product");
			System.out.println("3. Show Cart");
			System.out.println("4. Apply Coupon");
			System.out.println("5. Checkout");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int ch = sc.nextInt();

			switch (ch) {
			case 1 -> addProductToCart();
			case 2 -> removeProduct();
			case 3 -> cart.showCart();
			case 4 -> applyCoupon();
			case 5 -> checkout();
			case 6 -> {
				return;
			}
			default -> System.out.println("Invalid choice!");
			}
		}
	}

	private static void addProductToCart() {
		productManager.showAllProducts();
		System.out.print("Enter Product ID: ");
		String id = sc.next();

		Product p = productManager.getProductById(id);
		if (p == null) {
			System.out.println("Invalid Product ID!");
			return;
		}

		System.out.print("Enter quantity: ");
		int qty = sc.nextInt();

		try {
			p.reduceStock(qty);
			cart.addItem(p, qty);
			System.out.println("Item added to cart!");
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void removeProduct() {
		System.out.print("Enter Product ID to remove: ");
		String id = sc.next();
		cart.removeItem(id);
	}

	private static void applyCoupon() {
		System.out.print("Enter coupon code: ");
		String code = sc.next();

		try {
			if (!couponManager.isValid(code))
				throw new InvalidCouponException("Invalid coupon!");

			double discount = couponManager.getDiscount(code);
			double amount = cart.getTotal();
			double finalAmount = amount - (amount * discount / 100);

			System.out.println("Coupon applied! New total: " + finalAmount);

		} catch (InvalidCouponException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void checkout() {
		double amount = cart.getTotal();
		System.out.println("Final Amount: " + amount);
		System.out.println("Thank you for shopping!");
	}
}
