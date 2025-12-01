package e_CommerceShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItem> items = new ArrayList<>();

	public void addItem(Product p, int qty) {
		items.add(new CartItem(p, qty));
	}

	public void removeItem(String productId) {
		for (int i = 0; i< items.size(); i++) {
			CartItem ci = items.get(i);
			if (ci.getProduct().getProductId().equals(productId)) {
				items.remove(i);
				System.out.println("Item removed form cart");
				return;
			}
		}
		System.out.println("product not foud in cart");
	}

	public void showCart() {
		if (items.isEmpty()) {
			System.out.println("Cart is empty!");
			return;
		}

		System.out.println("\n--- CART ITEMS ---");
		for (CartItem ci : items) {
			System.out.println(ci.getProduct().getProductId() + " | " + ci.getProduct().name + " | qty: "
					+ ci.getQuantity() + " | total: " + ci.getTotal());
		}
	}

	public double getTotal() {
		double total = 0;
		for (CartItem ci : items) {
			total += ci.getTotal();
		}
		return total;
	}
}
